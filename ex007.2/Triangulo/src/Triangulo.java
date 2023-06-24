import java.util.Scanner;
public class Triangulo {
	public static void main (String [] args ) {
		int l1, l2, l3;
		boolean es, eq, tri;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o primeiro lado :");
		l1 = in.nextInt();
		System.out.println("Digite o segundo lado :");
		l2 = in.nextInt();
		System.out.println("Digite o terceiro lado :");
		l3 = in.nextInt();
		if (l1 <= l1+l3 || l2<=l1+l3 || l3<=l1+l2 ){
			System.out.println("Isto não é um triângulo.");
		} else if (l1 >= l1+l3 || l2>=l1+l3 || l3>=l1+l2 ){
			System.out.println("Isso é um triângulo.");
		} else if (l1 == l2 && l2==l3 ){
			System.out.println("Seu triângulo é Equilatero");
		} else if (l1 != l2 && l2!=l3 ) {
			System.out.println("Seu triângulo não é Equilatero");
		} else if (l1!=l2 && l2!=l3 && l3!=l1){
			System.out.println("Seu triângulo é Escaleno");
		} else if{
			System.out.println("Seu triângulo não é Escaleno.");
		} else if (l1==l2 || l2==l3) {
			System.out.println("Seu triângulo é Isósceles");
		} else {
			System.out.println("Seu triângulo não é Isósceles");
		}
	}
}
