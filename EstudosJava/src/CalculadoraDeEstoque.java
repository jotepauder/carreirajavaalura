
public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		
		double soma = 0;
		
		
		for ( double i = 0; i < 35; i ++) {
		 soma += 59.90;
	}
		
		//double soma = livroJava8 + livroTDD;
		System.out.println(" O total do estoque � : " + soma);
		
		if ( soma < 150) {
			System.out.println("Seu estoque est� muito baixo!");
		} else if (soma >= 2000) {
			System.out.println(" O seu estoque est� muito alto");
		} else {
			System.out.println(" Seu estoque est� bom");
		}
		
	}
}

/*inicializa��o do contador
while(condi��o) {
// atualiza��o do contador
} */ 

