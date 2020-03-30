
public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		//System.out.println(segundaConta.saldo);

		Conta terceiraConta = new Conta();
		terceiraConta.saldo = 150;
		//System.out.println(terceiraConta.saldo);
		
		Conta quartaConta =  new Conta();
		quartaConta.saldo = 20;
		
		
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		System.out.println("Terceira conta tem: " + terceiraConta.saldo);
		System.out.println("Quarta conta tem: " + quartaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
	
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta está" + " na agencia " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Contas iguais");
		} else {
			System.out.println(" São contas diferentes");
		}
	
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
