package com.application.tests;
import com.application.Lista;
import com.application.Objeto;

public class TestePrintLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objeto richard = new Objeto("Richard");
		Objeto ricardo = new Objeto("Ricardo");
		Objeto richar = new Objeto("Richar");

	    Lista lista = new Lista();

	    lista.adiciona(richard);
	    lista.adiciona(ricardo);
	    lista.adiciona(richar);
	    
	    System.out.println(lista);

	}

}
