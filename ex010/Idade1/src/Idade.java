import java.util.Scanner;
public class Idade {
	public static void main (String []args) {
		int idade, i, crianca=0,jovem1=0, jovem2=0, adulto=0, idoso=0;
		int pcrianca, pjovem1, pjovem2, padulto, pidoso;
		Scanner in = new Scanner (System.in);
		for (i=1;i<=5;i++) {
			System.out.println("Digite a idade da "+i+" pessoa:");
			idade = in.nextInt();
			if (idade<= 5) {
				crianca = crianca + 1;
			} else if (idade <= 30 && idade >=16) {
				jovem1 = jovem1 + 1;
			} else if (idade <= 45 && idade >=31) {
				jovem2 = jovem2 + 1;
			} else if (idade <= 60 && idade >=46) {
				adulto = adulto +1;
			} else {
				idoso = idoso + 1;
			}
		}
		pcrianca = 100 / 5 * crianca;
		pjovem1 = 100 / 5 * jovem1;
		pjovem2 = 100 / 5 * jovem2;
		padulto = 100 / 5 * adulto;
		pidoso = 100 / 5 * idoso;
		System.out.println("Primeira faixa: "+crianca+ " pessoas, Representa: "+pcrianca+"%");
		System.out.println("Segunda faixa: "+jovem1+ " pessoas, Representa: "+pjovem1+"%");
		System.out.println("Terceira faixa: "+jovem2+ " pessoas, Representa: "+pjovem2+"%");
		System.out.println("Quarta faixa: "+adulto+ " pessoas, Representa: "+padulto+"%");
		System.out.println("Quinta faixa: "+idoso+ " pessoas, Representa: "+pidoso+"%");
	}
}
