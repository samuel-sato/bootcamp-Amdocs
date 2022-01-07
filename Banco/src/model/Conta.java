package model;

public class Conta {
	
	private static long index = 0;
	
	private long numeroConta = 0;
	private int agencia;
	private Cliente titular;
	private double saldo;
	
	public Conta( int agencia, Cliente titular, double saldo) {
		this.numeroConta = index + 1;
		Conta.index++;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Conta( int agencia, Cliente titular) {
		this.numeroConta = index + 1;
		Conta.index++;
		this.agencia = agencia;
		this.titular = titular;

	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public long getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta conta) {
		if(this.saldo >= valor || conta != null) {
			this.saldo -= valor;
			conta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public void extrato() {
		System.out.println(this.toString());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		result = prime * result + (int) (numeroConta ^ (numeroConta >>> 32));
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia != other.agencia)
			return false;
		if (numeroConta != other.numeroConta)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", agencia=" + agencia + ", titular=" + titular + ", saldo="
				+ saldo + "]";
	}
	
}
