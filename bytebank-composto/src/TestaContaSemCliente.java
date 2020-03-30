
public class TestaContaSemCliente {
	
		public static void main(String[] args) {
			Conta contaDaThaynara = new Conta();
			System.out.println(contaDaThaynara.getSaldo());
		
			
			contaDaThaynara.titular = new Cliente();
			System.out.println(contaDaThaynara.titular);
			
			contaDaThaynara.titular.nome = "Thaynara";
			System.out.println(contaDaThaynara.titular.nome);
		}
}
