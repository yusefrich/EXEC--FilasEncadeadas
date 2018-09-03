package com.application;

public class Objeto {
	private String nome;
	private String descricao;
	private int cod;
	private Objeto proximo;
	
	public Objeto(){	
	}
	
	public Objeto(String setNome){	
		this.nome = setNome;
	}
	public Objeto(String setNome, String setDescricao){	
		this.nome = setNome;
		this.descricao = setDescricao;

	}
	public Objeto(String setNome, String setDescricao, int setCodigo){	
		this.nome = setNome;
		this.descricao = setDescricao;
		this.cod = setCodigo;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public Objeto getProximo() {
		return proximo;
	}
	public void setProximo(Objeto proximo) {
		this.proximo = proximo;
	}
	  public String toString() {
		  return nome;
	  }

}
