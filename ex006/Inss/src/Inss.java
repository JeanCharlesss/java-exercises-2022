import java.util.Scanner;
public class Inss {
	public static void main (String [] args) {
		int salBruto, sal9per, sal11per;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite seu salário bruto");
		salBruto = in.nextInt ();
		if (salBruto <= 2500) {
			sal9per = salBruto / 100 * 9;
			System.out.println ("Você irá pagar R$"+sal9per+" Reais de INSS (9%)");
		}
		else {
			sal11per = salBruto / 100 * 11;
			System.out.println("Você irá pagar R$"+sal11per+" Reais de INSS (11%");
		}
	}
}
