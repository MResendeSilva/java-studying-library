package bytebank.herdado;

public class TesteReferencia {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Resende");
		String nome = g1.getNome();
		
		g1.setSalario(5000.0);
		
//		Funcionario f = new Funcionario();
//		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Programador p = new Programador();
		p.setSalario(3060.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
//		controle.registra(f);
		controle.registra(ev);
		controle.registra(p);
		
		System.out.println(controle.getSoma());
	}	
}
