package bytebank.herdado;

// Contrato Autenticavel
	// Quem assina esse contrato precisa implementar:
		// Método setSenha
		// Método autentica

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);


}
