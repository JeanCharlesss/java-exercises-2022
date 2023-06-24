import java.util.Scanner;
public class VetorMedia {
	public static void main (String [] args ) {
		Scanner in = new Scanner(System.in);
		int a[],b[], c[];
		a = new int [10];
		b = new int [10];
		c = new int [10];
		for (int i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"o. valor do Vetor A:");
			a[i] = in.nextInt();
		}
		for (int i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"o. valor do Vetor B:");
			b[i] = in.nextInt();
		}
		for (int i=0;i<10;i++){
			c[i] = a[i] + b[i];
			c[i] = c[i] / 2;
			System.out.println(i+1+"o. Vetor ao quadrado é igual à "+c[i]);
		}
	}
}
