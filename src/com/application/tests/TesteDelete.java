package com.application.tests;
import com.application.Lista;
import com.application.Objeto;

public class TesteDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objeto care = new Objeto("Care");
		Objeto liss = new Objeto("Liss");
		Objeto hair = new Objeto("Hair");
		Objeto spray = new Objeto("Spray");

	    Lista lista = new Lista();
	    
	    lista.adiciona(care);
	    lista.adiciona(liss);
	    lista.adiciona(hair);
	    lista.adiciona(spray);
	    
	    System.out.println(lista);

	    lista.removeDoFim();
	    
	    System.out.println(lista);


	}

}
