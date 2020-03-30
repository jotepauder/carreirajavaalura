import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = input.nextLine();
		System.out.println("Digite a sua idade: ");
		int idade = input.nextInt();
		System.out.println("Digite o nome da sua cidade:");
		String cidade = input.next();
		System.out.println("Meu nome é " + nome + " a minha idade é " + idade + " anos" +  " e eu sou da cidade de " + cidade);
		//System.out.println();
		
	}

}


// nome, idade, cidade
