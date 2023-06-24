import java.util.Scanner;
public class Lucro {
	public static void main (String []args) {
		int lucro;
		double produto, margem, total;
		String s, i;
		Scanner in = new Scanner (System.in);
		try {
		do {
			System.out.println ("Digite o valor do produto");
			produto = in.nextDouble();
			System.out.println ("Digite a margem de lucro");
			lucro = in.nextInt ();
			margem = produto * lucro / 100;
			total = margem + produto;
			System.out.println("O valor do produto reajustado custará R$"+total);
			System.out.println("Você deseja continuar?[S/N]");
			i = in.next ();
		} while (i.equalsIgnoreCase ("S"));
		}catch (Exception erro) {
			System.out.println("Digite um valor válido, descrito acima \n"
					+ "Execute Novamente");
		}
		
	}
}
