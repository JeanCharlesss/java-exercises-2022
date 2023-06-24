import java.util.Scanner;
public class PosNegNeu {
	public static void main (String [] args) {
		int valor;
		try {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o valor pra descobrir se é Positivo, Negativo ou Neutro:");
		valor = in.nextInt ();
		if (valor == 0 ) {
			System.out.println("Seu número é Neutro");
		} else if (valor > 0) {
			System.out.println("Seu número é Positivo");
		} else {
			System.out.println("Seu número é Negativo");
		}
		} catch (Exception erro) {
			System.out.println("Não digite letras ou caracteres especiais \n."
					+"Erro"+erro+"\n"
					+"----------"
					+"execute novamento"
					+"----------");
		}
	}
}
