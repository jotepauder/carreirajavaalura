//n�o pode instanciar dessa classe, porque � abstrata

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	// metodo sem corpo, n�o h� implementacao 
	public abstract double getBonificacao(); 
		
	public String getNome() {
		return nome;
	}

	public String GetCpf() {
		return cpf;
	}
	  
	public double GetSalario() {
		return salario;
	}

	public void SetNome(String nome) {
		this.nome = nome;
	}

	public void SetCpf(String cpf) {
		this.cpf = cpf;
	}

	public void SetSalario(double salario) {
		this.salario = salario;
	}

}
