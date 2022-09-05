package com.fintech.model;

public abstract class Pessoa {
	
	//Atributos
	private String nome;
	private String endereco;
	private String email;
	private Integer telefone;
	
	
	//Construtores
	public Pessoa () {}
	
	
	public Pessoa(String nome, String endereco, String email, Integer telefone) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}

	//Metodos
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
			
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getTelefone() {
		return telefone;
	}


	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
	
	
	
	

}
