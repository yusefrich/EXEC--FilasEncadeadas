package com.application.tests;
import com.application.Lista;
import com.application.Objeto;

public class TesteDeleteAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objeto recreio = new Objeto("Recreio");
		Objeto intervalo = new Objeto("Intervalo");
		Objeto pausa = new Objeto("Pausa");

	    Lista lista = new Lista();
	    
	    //adiciona dados na array
	    lista.adiciona(recreio);
	    lista.adiciona(intervalo);
	    lista.adiciona(pausa);
	    
	    //print lista com dados
	    System.out.println(lista);

	    //deleta lista por completo
	    lista.delLista();
	    
	    System.out.println(lista);//resultado esperado é null / []
	    if(lista.toString() == "[]") {
	    	System.out.println("questão 7 - função okay");
	    }else {
	    	System.out.println("questão 7 - erro");
	    }

	}

}
