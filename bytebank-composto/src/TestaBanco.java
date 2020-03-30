
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente jp = new Cliente();
		jp.nome = " João Paulo";
		jp.cpf = " 000.000.000-22";
		jp.profissao = "programador";
		
		Conta contaDeJP = new Conta();
		contaDeJP.deposita(100);
		
		// associa o cliente jp a conta ContaDeJP 
		contaDeJP.titular = jp;
		System.out.println(contaDeJP.titular.nome);
		System.out.println(contaDeJP.titular);
		System.out.println(jp);
	}	
}
