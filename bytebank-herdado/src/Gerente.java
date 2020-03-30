//Gerente � um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel, � um autenticavel

public class Gerente  extends Funcionario implements Autenticavel	{

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Gerente");
		return super.GetSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}

	
}
