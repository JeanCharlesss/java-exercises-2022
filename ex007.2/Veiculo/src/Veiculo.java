import java.util.Scanner;
public class Veiculo {
	public static void main (String [] args) {
		int placa;
		try {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o último número da placa do seu veículo:");
		placa = in.nextInt ();
		if (placa == 1  || placa == 2){
			System.out.println("Você não pode circular na Segunda");	
		} else if ( placa == 3  || placa ==4){
			System.out.println("Você não pode circular na Terça");
		} else if ( placa == 5  || placa == 6) {
			System.out.println("Você não pode circular na Quarta");
		} else if (placa == 7  || placa == 8) {
			System.out.println("Você não pode circular na Quinta");
		} else if (placa == 0  || placa == 9) {
			System.out.println("Você não pode circular na Sexta");
		} else {
			System.out.println("Digite um valor válido de 0-9.");
		}
		} catch (Exception erro) {
			System.out.println("Digite apenas um número inteiro.\n Erro: "+erro+"\n"
					+"------------"
					+ "Execute novamente"
					+ "-----------");
		}
	}
}