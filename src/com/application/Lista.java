package com.application;
import java.util.Scanner;

public class Lista {
	  private Casa primeira;
	  
	  private Casa ultima;

	  private int contador;
	

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
	  public Object pega(int posicao) {
		  return this.pegaCelula(posicao).getElemento();

		  }
	  public int tamanho() {
	    return this.contador;
	  }
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
	  public void criarLista(int tamanho) {
		  for(int i = 0; i < tamanho; i++) {
			    this.adicionaNoComeco("null");
		  }
	  }
	  public void delLista() {
		  int totalDeElementos = contador ;
		  totalDeElementos--;
		  if(contador == 0) {
			  System.out.println("A lista ja se encontra vazia");
		  }else {
			  for (int i = 0; i < totalDeElementos; i++) {
				  this.removeDoFim();
			  }
			  this.removeDoComeco();
		  }
	  }
	  public int listaVazia() {
		  if(contador == 0) {
			  return 1;
		  }else {
			  return 0;
		  }
	  }
	  
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

		private Casa pegaCelula(int posicao) {
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
