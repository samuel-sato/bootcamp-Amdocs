package application;

import model.Banco;
import model.Cliente;
import model.Conta;

public class Program {
	public static void main(String[] args) {
		Banco b = new Banco("Brasil", "Guara", 2);
		
		Cliente c = new Cliente("sam", "123", "312", "31231");
		
		Conta conta0 = new Conta(123, c, 10);
		Conta conta1 = new Conta(123, c);
		
		b.controleCliente.adicionarNovoCliente(c);
		b.controleConta.adicionarNovoConta(conta0);
		b.controleConta.adicionarNovoConta(conta1);
		
		conta0.transferir(5, conta1);
		
		conta0.extrato();
		conta1.extrato();
		
		System.out.println("tudo funcionando");
		
	}

}
