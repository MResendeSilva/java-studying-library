package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(1, 111);
	
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(1, 222);
		cp.deposita(200);
		
		
		cc.transfere(10, cp); // transferindo 10 reais para conta poupança
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}
}
