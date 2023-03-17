package bytebank.herdado;

// Gerente herda da classe funcionário
public class EditorVideo extends Funcionario {
	
	
	
	
	public double getBonificacao() {
		System.out.println("Chamando bonificação do editor");
		return 150; // Executa o método da super class e depois somar com o salario do gerente
	}


}
