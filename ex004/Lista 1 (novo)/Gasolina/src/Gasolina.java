import java.util.Scanner;
public class Gasolina {
	public static void main (String[] args) {
		double pg,x,precoAtual,precoFinal;
		Scanner in = new Scanner (System.in);
		System.out.println("Preço da gasolina atual é ?");
		pg= in.nextDouble();
		System.out.println("Qual a porcentagem aumentada?");
		x= in.nextDouble();
		precoAtual= x/100*pg;
		precoFinal = precoAtual + pg;
		System.out.println("A Gasolina atual vale "+precoFinal);
	}
}
