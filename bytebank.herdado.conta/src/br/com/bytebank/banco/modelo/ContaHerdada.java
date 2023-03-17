package br.com.bytebank.banco.modelo;

public abstract class ContaHerdada {
	protected double saldo;
	private int agencia;
	private int numero;
	private ClienteHerdado titular;
	private static int total;
	

	public ContaHerdada(int agencia, int numero) {
		total++;
		System.out.println("O total de contas é: " + total);
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Estou criando uma conta!" + this.numero);
	}
	

	public abstract void deposita(double valor);

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("O saldo: " + this.saldo + ", valor: " + valor);
		} else {
			this.saldo -= valor;
		}
	}

	public void transfere(double valor, ContaHerdada destino) {
		this.saca(valor);
			destino.deposita(valor);
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero){
		if (numero <= 0) {
			System.out.println("Não pode número negativo!");
			return;
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor <= 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(ClienteHerdado titular) {
		this.titular = titular;
	}
	
	public ClienteHerdado getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return ContaHerdada.total;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
