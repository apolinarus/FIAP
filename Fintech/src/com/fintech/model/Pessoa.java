package com.fintech.model;

public abstract class Pessoa {
	
	//Atributos
	private String nome;
	private String endereco;
	private String email;
	private Integer telefone;
	
	
	//Construtores
	public Pessoa () {}
	
	//Metodos
	public Pessoa(String nome, String endereco, String email, Integer telefone) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}
	
	
	
	
	

}
