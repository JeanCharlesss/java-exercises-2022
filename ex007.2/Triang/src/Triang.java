
import java.util.Scanner;
public class Triang {
	public static void main (String [] args ) {
		int l1, l2, l3;
		boolean es, eq, tri;
		try {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o primeiro lado :");
		l1 = in.nextInt();
		System.out.println("Digite o segundo lado :");
		l2 = in.nextInt();
		System.out.println("Digite o terceiro lado :");
		l3 = in.nextInt();
		if (l1 < l2+l3 || l2 < l1+l3 || l3 < l2+l3) {
			System.out.println("Forma um triângulo,");
			if (l1==l2 && l2==l3){
				System.out.println("Equilatero");
				
			} else if (  l1!=l2 && l2!=l3){
				System.out.println("Escaleno");
			} else {
				System.out.println("isósceles");
			}
		} else {
			System.out.println("Isto não forma um triângulo");
		}
	} catch (Exception erro) {
		System.out.println("Digite um número inteiro válido, você usou vírgulas, ou caracteres especiais \n."
				+"Erro"+erro+"\n"
				+"----------"
				+"execute novamento"
				+"----------");
	}
	}
}