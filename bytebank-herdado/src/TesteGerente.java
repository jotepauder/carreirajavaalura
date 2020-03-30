
public class TesteGerente {
	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		
		Gerente g1 = new Gerente();
		g1.SetNome("Thaynara");
		g1.SetCpf("04998803255");
		g1.SetSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.GetCpf());
		System.out.println(g1.GetSalario());
	
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	
	}
}
