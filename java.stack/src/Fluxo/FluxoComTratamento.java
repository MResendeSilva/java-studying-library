package Fluxo;

public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		 try {
			 metodo1();
	 } catch (Exception ex) {
		 String msg = ex.getMessage();
		 System.out.println("Exception " + msg);
		 ex.printStackTrace();
		 
	 } 
	  
		System.out.println("Fim do main");
	}
	
	
	public static void metodo1() {
		System.out.println("Ini do metodo1");
		 try {
				 metodo2();
		 } catch (ArithmeticException ex) {
//			 String msg = ex.getMessage();
//			 System.out.println(ex + msg);
//			 ex.printStackTrace();
		 } catch (NullPointerException ex) {
			 String msg = ex.getMessage();
		 System.out.println("NullPointerException " + msg);
//			 ex.printStackTrace();
		 }
		 
		System.out.println("Fim do metodo1");
	}
	
	public static void metodo2() {
		System.out.println("Ini do metodo2");
		
		throw new MinhaException("Ai quebrou tudo");
		
		
		
//		System.out.println("Fim do metodo2");
	}
	
}
