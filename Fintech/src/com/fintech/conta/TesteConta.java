package com.fintech.conta;

public class TesteConta {
	
	public static void main(String[] args) {
		
		//Instancia um objeto da classe Conta
		Conta cc = new Conta(111, 222, 5000);
		
		//Exibe o número da agência no console.
		System.out.println(cc.getAgencia()); 
	}

}
