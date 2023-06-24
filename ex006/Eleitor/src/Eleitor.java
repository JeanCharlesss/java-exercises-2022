import java.util.Scanner;
public class Eleitor {
	public static void main (String[] args) {
		int idade,atual,nasc ;
		Scanner in = new Scanner (System.in);
		System.out.println("Qual o ano em que você nasceu?");
		nasc = in.nextInt();
		System.out.println("Qual o ano atual?");
		atual = in.nextInt();
		idade = atual-nasc;
		System.out.println("Sua idade é "+idade+" anos, então");
		if (idade >= 16) {
			System.out.println("Você está aprovado para tirar o Título de eleior");
		}
		
	}

}
