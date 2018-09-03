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
	    
	    lista.adiciona(alves);
	    lista.adiciona(alvo);
	    lista.adiciona(naMoxca);

	    System.out.println(lista.contem(alves));
	    System.out.println(lista.contem(ricardo));

	}

}
