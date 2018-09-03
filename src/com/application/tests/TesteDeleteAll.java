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
	    
	    lista.adiciona(recreio);
	    lista.adiciona(intervalo);
	    lista.adiciona(pausa);
	    
	    System.out.println(lista);

	    lista.delLista();
	    
	    System.out.println(lista);

	}

}
