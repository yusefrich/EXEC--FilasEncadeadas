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
		    
		    lista.adicionaNoComeco(yusef);
		    lista.adicionaNoComeco(josefi);
		    lista.adicionaNoComeco(josefino);

		    System.out.println(lista);
	}

}
