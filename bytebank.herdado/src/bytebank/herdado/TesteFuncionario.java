package bytebank.herdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente func = new Gerente();
		
		func.setNome("Mateus Resende");
		func.setCpf("113245367580");
		func.setSalario(1800.00);
		func.setTipo(1);
		
		System.out.println(func.getNome());
//		System.out.println(func.getBonificacao());
		
	}
}
