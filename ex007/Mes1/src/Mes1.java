import java.util.Scanner;
public class Mes1 {
	public static void main (String [] args) {
		int mes;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o número do mês para descobrir quantos dias tem:"
				+ "\n"
				+ "1 - Janeiro"
				+ "\n"
				+ "2 - Fevereiro"
				+ "\n"
				+ "3 - Março"
				+ "\n"
				+ "4 - Abril"
				+ "\n"
				+ "5 - Maio"
				+ "\n"
				+ "6 - Junho"
				+ "\n"
				+ "7 - Julho"
				+ "\n"
				+ "8 - Agosto"
				+ "\n"
				+ "9 - Setembro"
				+ "\n"
				+ "10 - Outubro"
				+ "\n"
				+ "11 - Novembro"
				+ "\n"
				+ "12 - Dezembro");
		mes = in.nextInt();
		switch (mes) {
	case 1 :
		mes = 31;
		System.out.println("Este mês possui "+mes+" dias.");
		break;
	case 2 :
		mes = 28;
		System.out.println("Este mês possui "+mes+" dias.");
		break;
	case 3 :
		mes = 31;
		System.out.println("Este mês possui "+mes+" dias.");
		break;
	case 4 :
		mes = 30;
		System.out.println("Este mês possui "+mes+" dias.");
		break;
	case 5 :
		mes = 31;
		System.out.println("Este mês possui "+mes+" dias.");
		break;
	case 6 :
		mes = 30;
		System.out.println("Este mês possui "+mes+" dias.");
		break;
	case 7 :
		mes = 31;
		System.out.println("Este mês possui "+mes+" dias.");
		break;
	case 8 :
		mes = 31;
		System.out.println("Este mês possui "+mes+" dias.");
		break;
	case 9 :
		mes = 30;

		break;
	case 10 :
		mes = 31;

		break;
	case 11 :
		mes = 30;
		System.out.println("Este mês possui "+mes+" dias.");
		break;
	case 12 :
		mes = 31;
		System.out.println("Este mês possui "+mes+" dias.");
		break;
	}
		
 }
}
