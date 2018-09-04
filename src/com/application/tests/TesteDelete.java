package com.application.tests;
import com.application.Lista;
import com.application.Objeto;

public class TesteDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//gera objetos
		Objeto care = new Objeto("Care");
		Objeto liss = new Objeto("Liss");
		Objeto hair = new Objeto("Hair");
		Objeto spray = new Objeto("Spray");

	    Lista lista = new Lista();
	    //adiciona elementos
	    lista.adiciona(care); 
	    lista.adiciona(liss);
	    lista.adiciona(hair);
	    lista.adiciona(spray);
	    
	    System.out.println(lista);
	    //remove elemento do fim da lista
	    lista.removeDoFim();
	    
	    System.out.println(lista);// saida esperada, lista sem o ultimo elemento - spray
	    
	    if(!lista.contem(spray)) {
	    	System.out.println("questão 6 - função okay");
	    }else {
	    	System.out.println("questão 6 - erro");
	    }


	}

}
