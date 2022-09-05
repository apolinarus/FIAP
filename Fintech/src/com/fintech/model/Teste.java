package com.fintech.model;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		//Instancia o objeto pessoa1
		PessoaFisica pessoa1 = new PessoaFisica();
		
		//Recebendo os dados do usuário
		System.out.println("Por favor, informe o nome do usuário: ");		
		pessoa1.setNome(leitor.nextLine());
		
		System.out.println("Por favor, insira seu email: ");
		pessoa1.setEmail(leitor.nextLine());
		
		System.out.println("Por favor, informe sua data de nascimento: Ex:(01/01/2001) ");
		pessoa1.setDtNascimento(leitor.nextLine());
		
		System.out.println("Por favor, informe seu CPF: (Apenas numeros. Ex: 11111111111)");
		pessoa1.setCpf(leitor.nextBigInteger());
		
		System.out.println("Por favor, informe seu RG: (Apenas numeros. Ex: 11111111111)");
		pessoa1.setRgInteger(leitor.nextBigInteger());
		
		//Sistema gerando dados bancários para este usuário
		ContaPoupanca cp1 = new ContaPoupanca(11111, 2222, 5000.00, 13.65);
		pessoa1.setContaPoupanca(cp1);
					
		System.out.println("\n\n\t!!!A conta foi criada com sucesso!!!");
		
		//Sistema exibindo dados cadastrados pelo usuário
		System.out.println("\n\nO nome do correntista: "+ pessoa1.getNome());
		System.out.println("O seu email é: "+ pessoa1.getEmail());
		System.out.println("Data de Nascimento: "+ pessoa1.getDtNascimento());
		System.out.println("Seu CPF e RG são: "+ pessoa1.getCpf() + " | " + pessoa1.getRg());
		
		
		System.out.println("\n\n\t!!!Gerando dados bancários!!!");
		
		
		//Sistema exibindo dados bancários "gerados automaticamente" para este usuário.
		System.out.println("\n\n\t Dados Bancários de:"+ pessoa1.getNome());
		
		System.out.println("\n\nSua agencia é: "+ pessoa1.getContaPoupanca().getAgencia() );
		System.out.println("Seu numero de conta é: "+ pessoa1.getContaPoupanca().getNumero() );
		System.out.println("Com o saldo: "+ pessoa1.getContaPoupanca().getSaldo() );
		System.out.println("O rendimento da sua conta poupança é de: "+ pessoa1.getContaPoupanca().getTxJuros()+"% ao ano." );	
		

	}

}
