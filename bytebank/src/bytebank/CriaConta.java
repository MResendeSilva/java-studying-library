package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // Instanciando o objeto do tipo conta 
		Conta segundaConta = new Conta();
		
		
		primeiraConta.saldo = 200;
		
		
		primeiraConta.saldo += 100;
		
		segundaConta.saldo = 50;
		
		
		System.out.println(String.format( "Na primeira conta tem %.2f",primeiraConta.saldo));
		System.out.println(String.format( "Na segunda conta tem %.2f",segundaConta.saldo));
	}
}
