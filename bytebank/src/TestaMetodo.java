
public class TestaMetodo {
	
	public static void main(String [] args) {
		Conta contaDeJP = new Conta();
		contaDeJP.saldo = 100;
		contaDeJP.deposita(50);
		System.out.println(contaDeJP.saldo);
		
		boolean conseguiuRetirar = contaDeJP.saca(20);
		System.out.println(contaDeJP.saldo);
		System.out.println(conseguiuRetirar);
	
		Conta contaDaThaynara = new Conta();
		contaDaThaynara.deposita(1000); 
		boolean sucessoTransferencia = contaDaThaynara.transfere(300, contaDeJP);
		if(sucessoTransferencia) {
			System.out.println("Tranferencia com sucesso");
		} else {
			System.out.println(" Faltou dinheiro");
		}
		System.out.println(contaDaThaynara.saldo);
		System.out.println(contaDeJP.saldo);
	
		contaDeJP.titular = " joao ferreira";
		System.out.println(contaDeJP.titular);
		
		//System.out.println("O nome da sua conta é: " + contaDeJP.titular);
	}
}
