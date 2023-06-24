import java.util.Scanner;
public class Buffet1 {
	public static void main (String [] args ) {
		Scanner in = new Scanner (System.in);
		int salao, decoracao, orcamento;
		try {
		System.out.println("Digite o numero do salao que voce deseja:"
				+ "\n"
				+ "1 - Ouro"
				+ "\n"
				+ "2 - Diamante"
				+ "\n");
	salao = in.nextInt();
	switch (salao) {
	case 1 :
		salao = 370;
		System.out.println("Este salaoo custa R$"+salao+" reais.");
		break;
	case 2 :
		salao = 520;
		System.out.println("Este salao custa R$"+salao+" reais.");
		break;
	default :
		System.out.println ("Salao desconhecido.");
	}
	System.out.println("Digite o numero da decoracao que voce deseja:"
			+ "\n"
			+ "1 - Amarilis"
			+ "\n"
			+ "2 - Violeta"
			+ "\n"
			+ "3 - Orquidea"
			+ "\n"
			+ "4 - Lirio"
			+ "\n");
	decoracao = in.nextInt();
	switch (decoracao) {
	case 1 :
		decoracao = 250;
		System.out.println("Esta decoracao custa R$"+decoracao+" reais");
		break;
	case 2 :
		decoracao = 250;
		System.out.println("Esta decoracao custa R$"+decoracao+" reais");
		break;
	case 3 :
		decoracao = 360;
		System.out.println("Esta decoracao custa R$"+decoracao+" reais");
		break;
	case 4 :
		decoracao = 360;
		System.out.println("Esta decoracao custa R$"+decoracao+" reais");
		break;
	default : 
		System.out.println("Decoracao desconhecida");
	}
	orcamento = salao + decoracao;
	System.out.println("Seu orcamento final R$"+orcamento);
	} catch (Exception erro ) {
		System.out.println("Por favor, digite os números indicadoss acima. \n erro:"+erro+"\n"
				+"-----------execute novamente-----------");
	}
}
}