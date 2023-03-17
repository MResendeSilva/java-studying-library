package Fluxo;

public class Fluxo {
	int t = null;
	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}
	
	
	public static void metodo1() {
		System.out.println("Ini do metodo1");
			metodo2();
		
		System.out.println("Fim do metodo1");
	}
	
	public static void metodo2() {
		System.out.println("Ini do metodo2");
		
		try {
			
		} catch (Exception ex) {
			ex.getMessage();
		}
		
		
		// throw new MinhaException("Ai quebrou tudo");
		System.out.println("Fim do metodo2");
	}
	
}
