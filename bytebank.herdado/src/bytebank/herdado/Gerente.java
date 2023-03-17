package bytebank.herdado;
// Assina o contrato do autenticavel
// Gerente herda da classe funcionário e é um autenticavel tambémm
public class Gerente extends  Funcionario implements Autenticavel {
	private int senha;
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando método do gerente");
		return super.getSalario(); // Executa o método da super class e depois somar com o salario do gerente
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
		
	}
	}



