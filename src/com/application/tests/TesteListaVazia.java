package com.application.tests;
import com.application.Lista;
import com.application.Objeto;

public class TesteListaVazia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Lista lista = new Lista();
	    Lista lista2 = new Lista();
	    
		Objeto oliveira = new Objeto("Oliveira");
		Objeto oliver = new Objeto("Oliver");

	    lista.adicionaNoComeco(oliveira);
	    lista.adicionaNoComeco(oliver);
	    
	    System.out.println("A lista 1 esta = " + lista.listaVazia());//saida esperada 0
	    System.out.println("A lista 2 esta = " + lista2.listaVazia());//saida esperada 1
	    
	    if(lista.listaVazia() == 0 && lista2.listaVazia() == 1) {
	    	System.out.println("questão 4 - função okay");

	    }else {
	    	System.out.println("questão 4 - erro");
	    }
	}
}
