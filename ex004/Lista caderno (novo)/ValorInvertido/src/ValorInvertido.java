import java.util.Scanner;
public class ValorInvertido {
	public static void main (String [] args) {
		int a,b,c;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o valor de A");
		a = in.nextInt ();
		System.out.println("Digite o valor de B");
		b = in.nextInt ();
		c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("Agora o valor de A é "+a+", e o valor de B é "+b);
	}

}
