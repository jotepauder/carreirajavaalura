
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		
		
		
		Gerente jp = new Gerente();
		jp.SetNome("JP Ferreira");
		jp.SetCpf("0498890348-8");
		jp.SetSalario(2600.00);
	
		System.out.println(jp.getNome());
		System.out.println(jp.getBonificacao());
		
			
	}
}
