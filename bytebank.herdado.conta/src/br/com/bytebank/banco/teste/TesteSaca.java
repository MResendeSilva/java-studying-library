/**
 *  testando documentação	
 */


package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaHerdada;

public class TesteSaca {
	
	public static void main(String[] args) {
	
		ContaHerdada c = new ContaCorrente(123 , 321);
		c.deposita(200);
		c.saca(110);
		
		System.out.println(c.getSaldo());
		
		
		
	}
	
}
