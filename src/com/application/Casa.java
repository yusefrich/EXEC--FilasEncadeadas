package com.application;

public class Casa {
	  private Casa proxima;
	  private Casa anterior;

	  private Object elemento;

	  public Casa(Casa proxima, Object elemento) {
	    this.proxima = proxima;
	    this.elemento = elemento;
	  }

	  public Casa(Object elemento) {
	    this.elemento = elemento;
	  }

	  public void setProxima(Casa proxima) {
	    this.proxima = proxima;
	  }

	  public Casa getProxima() {
	    return proxima;
	  }
	  
	  public Object getElemento() {
	    return elemento;
	  }
	  public Casa getAnterior() {
    	return anterior;
	  }
		  
	  public void setAnterior(Casa anterior) {
	    this.anterior = anterior;
	  }

}
