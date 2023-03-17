package bytebank.herdado;

public class SistemaInterno {
	private int senha = 123;
		
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha); // aqui ele vai ver se a senha do gerente (recebida pelo this.senha) bate com a senha do sistema interno
		
		if (autenticou) {
			System.out.println("Entrou no sistema");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	
	}
	
}
