
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.SetNome("Bruce");
		g1.SetSalario(5000.0);
		
		
		//Funcionario f = new Funcionario();
		//f.SetSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.SetSalario(2500.0);
		
		Designer d = new Designer();
		d.SetSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		//controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
	}

}
