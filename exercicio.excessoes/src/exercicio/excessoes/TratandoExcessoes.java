package exercicio.excessoes;

import java.util.Scanner;

public class TratandoExcessoes {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("n1");
		int n1 = leitor.nextInt();
		
		System.out.println("n2");
		int n2 = leitor.nextInt();
		
		try {
			int result = n1 / n2;
			} catch (Exception ex) {
				System.out.println(ex);
			}
			
		System.out.println("Finalizei o método");
	}
	

}
