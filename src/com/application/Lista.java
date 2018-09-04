package com.application;

public class Lista {
	  private Casa primeira;//primeiro elemento representado pela lista
	  
	  private Casa ultima;//ultimo elemento representado pela lista

	  private int contador;//contador, guarda o tamanho atual da lista
	

	  //Adiciona elemento a lista
	  public void adiciona(Object elemento) {
		  if (this.contador == 0) {
			    this.adicionaNoComeco(elemento);
			  } else {
			    Casa nova = new Casa(elemento);
			    this.ultima.setProxima(nova);
			    nova.setAnterior(this.ultima);
			    this.ultima = nova;
			    this.contador++;
			  }
	  }
	  //faz referencia a casa a partir da posição indicada
	  public Object pega(int posicao) {
		  return this.pegaCasa(posicao).getElemento();

		  }
	  //retorna o tamanho da lista
	  public int tamanho() {
	    return this.contador;
	  }
	  //busca na lista se ha algum valor igual ao Objeto passado
	  public boolean contem(Object elemento) {
		  
		  Casa atual = this.primeira;

		  while (atual != null) {
		    if (atual.getElemento().equals(elemento)) {
		      return true;
		    }
		    atual = atual.getProxima();
		  }
		  return false;
	  }
	  //cria uma lista e adiciona o valor null a ela
	  public void criarLista(int tamanho) {
		  for(int i = 0; i < tamanho; i++) {
			    this.adicionaNoComeco("null");
		  }
	  }
	  //deleta todos os itens da lista
	  public void delLista() {
		  int totalDeElementos = contador ;
		  if(contador == 0) {
			  System.out.println("A lista ja se encontra vazia");
		  }else {
			  for (int i = 0; i < totalDeElementos; i++) {
				  this.removeDoFim();// remove do fim todos os elemenos
			  }
		  }
	  }
	  //checa se a lista esta vazia
	  public int listaVazia() {
		  if(contador == 0) {
			  return 1;
		  }else {
			  return 0;
		  }
	  }
	  //adiciona elemento no começo da lista
	  public void adicionaNoComeco(Object elemento) {
		  if(this.contador == 0){
			    Casa nova = new Casa(elemento);
			    this.primeira = nova;
			    this.ultima = nova;
			  } else {
			    Casa nova = new Casa(this.primeira, elemento);
			    this.primeira.setAnterior(nova);
			    this.primeira = nova;
			  }
			  this.contador++;
	  }
	  //retorna o primeiro elemento da lista
	  public Object primeiroElemento() {
		  return primeira.getElemento();
	  }
	  //remove elemento do comeco da lista
	  public void removeDoComeco() {
		  if (!this.posicaoOcupada(0)) {
			    throw new IllegalArgumentException("Posição não existe");
			  }

			  this.primeira = this.primeira.getProxima();
			  this.contador--;
			  
			  if (this.contador == 0) {
			    this.ultima = null;
			  }

	  }
	  //remove elemento do fim da lista
	  public void removeDoFim() {
		  if (!this.posicaoOcupada(this.contador - 1)) {
			    throw new IllegalArgumentException("Posição não existe");
			  }
			  if (this.contador == 1) {
			    this.removeDoComeco();
			  } else {
			    Casa penultima = this.ultima.getAnterior();
			    penultima.setProxima(null);
			    this.ultima = penultima;
			    this.contador--;
			  }

	  }
	  //funcao de print
	  public String toString() {

		  // Verificando se a Lista está vazia
		  if(this.contador == 0){
		    return "[]";
		  }
		  
		  StringBuilder builder = new StringBuilder("[");
		  Casa atual = primeira;

		  // Percorrendo até o penúltimo elemento.
		  for (int i = 0; i < this.contador - 1; i++) {
		    builder.append(atual.getElemento());
		    builder.append(", ");
		    atual = atual.getProxima();
		  }

		  // último elemento
		  builder.append(atual.getElemento());
		  builder.append("]");
		  
		  return builder.toString();
		}
	  
	  //busca de casa
	  private boolean posicaoOcupada(int posicao){
		  return posicao >= 0 && posicao < this.contador;
		}
	  	
	  private Casa pegaCasa(int posicao) {
		  if(!this.posicaoOcupada(posicao)){
		    throw new IllegalArgumentException("Posição não existe");
		  }

		  Casa atual = primeira;
		  for (int i = 0; i < posicao; i++) {
		    atual = atual.getProxima();
		  }
		  return atual;
		}
}
