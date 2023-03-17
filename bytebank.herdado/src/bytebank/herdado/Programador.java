package bytebank.herdado;

// Gerente herda da classe funcionário
public class Programador extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando bonificação do programador");
		return 200; // Executa o método da super class e depois somar com o salario do gerente
	}


}
