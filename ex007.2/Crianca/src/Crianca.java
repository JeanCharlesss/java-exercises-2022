import java.util.Scanner;
public class Crianca {
	public static void main (String [] args ){
		int nasc,atual, idade;
		try {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o ano em que você nasceu: ");
		nasc = in.nextInt ();
		System.out.println("Digite o ano atual : ");
		atual = in.nextInt ();
		idade = atual - nasc;
		if (idade <= 10 ){
			System.out.println("Você é uma criança.");
		} else if (idade >= 10 && idade <18) {
			System.out.println("Você é um adolescebte.");
			
		} else if (idade >=18 && idade <= 60){
			System.out.println("Você é um adulto.");
		} else {
			System.out.println("Você é um idoso.");
		}
		} catch (Exception erro) {
			System.out.println("Digite um número inteiro. \n Erro: "+erro+" \n"
					+"-----------"
					+"Execute novamente"
					+"-----------");
		}
	}

}
