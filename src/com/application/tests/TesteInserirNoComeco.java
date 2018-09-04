package com.application.tests;
import com.application.Lista;
import com.application.Objeto;

public class TesteInserirNoComeco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Objeto yusef = new Objeto("Yusef");
			Objeto josefi = new Objeto("Josefi");
			Objeto josefino = new Objeto("Josefino");
				
		    Lista lista = new Lista(); 
		    
		    //variavel para efetivar teste
		    boolean primeiroElementoTestado = true;
		   
		    //insere elemento na lista
		    lista.adicionaNoComeco(yusef);
		    System.out.println(lista);
		    
		    //checa se o primeiro elemento da lista é o adicionado
		    if (lista.primeiroElemento() != yusef) {
		    	primeiroElementoTestado = false;
		    }
		    
		    lista.adicionaNoComeco(josefi);
		    System.out.println(lista);
		    
		    //checa se o primeiro elemento da lista é o adicionado
		    if (lista.primeiroElemento() != josefi) {
		    	primeiroElementoTestado = false;
		    }


		    lista.adicionaNoComeco(josefino);
		    System.out.println(lista);
		    
		    //checa se o primeiro elemento da lista é o adicionado
		    if (lista.primeiroElemento() != josefino) {
		    	primeiroElementoTestado = false;
		    }
		    
		    //check final
		    if(primeiroElementoTestado) { 
		    	System.out.println("questão 2 - função okay");
		    }else {
		    	System.out.println("questão 2 - erro");
		    }

	}

}
