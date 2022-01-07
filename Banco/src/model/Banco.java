package model;

import entities.ControleCliente;
import entities.ControleConta;

public class Banco {

	private String nome;
	private String endereco;
	private int agencia;
	
	public ControleConta controleConta = new ControleConta();
	public ControleCliente controleCliente = new ControleCliente();
	
	public Banco(String nome, String endereco, int agencia) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getendereco() {
		return endereco;
	}

	public void setendereco(String endereco) {
		this.endereco = endereco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	
	
		
}
