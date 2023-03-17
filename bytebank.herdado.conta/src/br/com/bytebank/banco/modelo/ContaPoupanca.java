package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends ContaHerdada {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
