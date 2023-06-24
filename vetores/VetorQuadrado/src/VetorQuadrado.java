import java.util.Scanner;
public class VetorQuadrado {
	public static void main (String [] args ) {
		Scanner in = new Scanner(System.in);
		int a[],b[];
		a = new int [5];
		b = new int [5];
		for (int i=0;i<5;i++) {
			System.out.println("Digite o "+(i+1)+"o. valor:");
			a[i] = in.nextInt();
		}
		for (int i=0;i<5;i++){
			b[i] = a[i] * a[i]; 
			System.out.println(i+1+"o. Vetor ao quadrado é igual é "+b[i]);
		}
	}
}
