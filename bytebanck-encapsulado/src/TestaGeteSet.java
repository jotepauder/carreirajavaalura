
public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());
	
		Cliente paulo = new Cliente();
		//conta.titula = paulo;
		paulo.setNome("paulo ferreira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
	
		conta.getTitular().setProfissao("programador");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
	
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
	
}
