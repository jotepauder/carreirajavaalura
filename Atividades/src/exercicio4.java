import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual é a sua idade?");
		int minhaIdade = input.nextInt();
		System.out.println("Qual é a idade da sua mãe?");
		int idadeMae =  input.nextInt();
		//System.out.println(minhaIdade);
		//System.out.println(idadeMae);
		int anos = idadeMae - minhaIdade;
		
		System.out.println("A minha mãe é " + anos + " anos" + " mais velha do que eu.");
	}

}
// Leia primeiro o problema, entenda o problema e depois busque a solução na logica
// Regra simples de matématica, o primeiro valor maior