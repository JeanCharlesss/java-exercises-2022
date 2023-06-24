import java.util.Scanner;
public class VetorInvertido {
	public static void main (String [] args ) {
		Scanner in = new Scanner(System.in);
		int a[],i=0;
		a = new int [10];
		for (i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"o. valor:");
			a[i] = in.nextInt();
		}
		for ( i=9;i>=0;i--){
			System.out.println("o "+(i+1)+"o. valor do vetor é "+a[i]);
		}
	}
}
