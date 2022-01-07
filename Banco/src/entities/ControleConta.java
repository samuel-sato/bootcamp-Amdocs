package entities;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Conta;

public class ControleConta {
	
	private List<Conta> listaContas = new ArrayList<>();
	
	public ControleConta() {
		
	}
	
	public void adicionarNovoConta(Conta c) {
		this.listaContas.add(c);
	}
	
	public void editarConta(Conta c) {
		
		if( this.listaContas.removeIf(conta -> conta.getNumeroConta() == c.getNumeroConta())) {
			this.listaContas.add(c);
		};
	}
	
	public void exluirConta(Conta c) {
		this.listaContas.remove(c);
	}
	
	public List<Conta> listaConta() {
		return this.listaContas;
	}


}
