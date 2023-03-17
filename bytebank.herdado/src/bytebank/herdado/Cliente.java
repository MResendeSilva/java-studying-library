package bytebank.herdado;

public class Cliente implements Autenticavel{
	
	private int senha;
	private AutenticacaoUtil autenticador;
	
	
	public Cliente() {
		AutenticacaoUtil au = new AutenticacaoUtil();
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
