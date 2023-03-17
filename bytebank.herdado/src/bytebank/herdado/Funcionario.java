package bytebank.herdado;
// Não é possível instanciar dessa classe, pois a mesma é abstrat

public abstract class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	private int senha;
	private int tipo = 0; // 0 - funcionário comum  1 - gerente  2 - diretor
	
	// Esse método não possui corpo, não há implementação. (Os filhos irão implementar este método)
	public abstract double getBonificacao(); 
	
	public void setTipo(int tipo) {
		
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
