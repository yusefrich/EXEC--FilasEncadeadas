package com.application.tests;
import com.application.Lista;
import com.application.Objeto;

public class TesteBuscarNaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objeto alves = new Objeto("Alves");
		Objeto alvo = new Objeto("Alvo");
		Objeto naMoxca = new Objeto("NaMoxca");
		Objeto ricardo = new Objeto("Ricardo");

	    Lista lista = new Lista();
	    
	    //adiciona dados na lista
	    lista.adiciona(alves);
	    lista.adiciona(alvo);
	    lista.adiciona(naMoxca);
	    
	    System.out.println(lista.contem(alves));//saida esperado true
	    System.out.println(lista.contem(ricardo));//saida esperada false
	    
	    if(lista.contem(alves) && !lista.contem(ricardo)) {
	    	System.out.println("questão 5 - função okay");
	    }else {
	    	System.out.println("questão 5 - erro");

	    }

	}

}
