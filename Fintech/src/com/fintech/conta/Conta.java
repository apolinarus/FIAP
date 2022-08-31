package com.fintech.conta;

public class Conta {
	
	//Atributos
	private int numero;
	private int agencia;
	private double saldo;
	
	
	//Construtores
	public Conta(){
		
	}
	
	public Conta(int numero, int agencia, double saldo){
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	
	//Metodos
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void depositar(double saldo) {
		this.saldo += saldo;
	}
	
	
}
