import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual � a sua idade?");
		int minhaIdade = input.nextInt();
		System.out.println("Qual � a idade da sua m�e?");
		int idadeMae =  input.nextInt();
		//System.out.println(minhaIdade);
		//System.out.println(idadeMae);
		int anos = idadeMae - minhaIdade;
		
		System.out.println("A minha m�e � " + anos + " anos" + " mais velha do que eu.");
	}

}
// Leia primeiro o problema, entenda o problema e depois busque a solu��o na logica
// Regra simples de mat�matica, o primeiro valor maior