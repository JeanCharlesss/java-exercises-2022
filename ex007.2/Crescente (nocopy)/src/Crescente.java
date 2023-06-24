import java.util.Scanner;
public class Crescente {
	public static void main (String [] args) {
		int a,b,c;
		
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o valor de A:");
		a = in.nextInt ();
		System.out.println("Digite o valor de B:");
		b = in.nextInt ();
		System.out.println("Digite o valor de C:");
		c = in.nextInt ();
		if (a<b) {
			if (b<c) {
				System.out.println(a);
			}
			else if  (a<c) {
				System.out.println(b);
				
			} else {
				System.out.println(c);
			}
		}
	}
}
