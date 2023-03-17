package bytebank.herdado;

public class TesteGerente {
	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("1234567899");
		g1.setSalario(4000.0);
		g1.setSenha(222);
		
		System.out.println(
				String.format("Nome do funcionário: %s\n"
						+ "CPF: %s\n"
						+ "Salário: %.2f", g1.getNome(), g1.getCpf(), g1.getSalario()));
		
		System.out.println(g1.autentica(222));
		System.out.println(g1.getBonificacao());
		
	}
}
