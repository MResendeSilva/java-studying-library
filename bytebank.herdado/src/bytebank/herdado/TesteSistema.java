package bytebank.herdado;

public class TesteSistema {
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(123);
		
		Administrador adm = new Administrador();
		adm.setSenha(000);
		
		Cliente cl = new Cliente();
		cl.setSenha(123);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cl);
		
	}
}
