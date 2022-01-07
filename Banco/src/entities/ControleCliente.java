package entities;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ControleCliente {
	
	private List<Cliente> listaClientes = new ArrayList<>();
	
	public ControleCliente() {
		
	}
		
	public void adicionarNovoCliente(Cliente c) {
		this.listaClientes.add(c);
	}
	
	public void editarCliente(Cliente c) {
		
		if( this.listaClientes.removeIf(cliente -> cliente.getCpf().equals(c.getCpf()))) {
			this.listaClientes.add(c);
		};
	}
	
	public void exluirCliente(Cliente c) {
		this.listaClientes.remove(c);
	}
	
	public List<Cliente> listaClientes() {
		return this.listaClientes;
	}

}
