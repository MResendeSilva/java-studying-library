package bytebank.encapsulado;

public class testeGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1000);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
	}
}
