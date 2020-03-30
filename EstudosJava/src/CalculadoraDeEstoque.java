
public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		
		double soma = 0;
		
		
		for ( double i = 0; i < 35; i ++) {
		 soma += 59.90;
	}
		
		//double soma = livroJava8 + livroTDD;
		System.out.println(" O total do estoque é : " + soma);
		
		if ( soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		} else if (soma >= 2000) {
			System.out.println(" O seu estoque está muito alto");
		} else {
			System.out.println(" Seu estoque está bom");
		}
		
	}
}

/*inicialização do contador
while(condição) {
// atualização do contador
} */ 

