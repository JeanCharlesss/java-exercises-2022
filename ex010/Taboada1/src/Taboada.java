import java.util.*;
public class Taboada {
	public static void main (String [] args) {
		int n, resultado, cont1=0,cont2=0;
		while (cont1<=10) {
			for (cont2=0;cont2<=10;cont2++){
				resultado = cont2 * cont1;
				System.out.println(cont1+" x "+cont2+" = "+resultado);
			}
			System.out.println("----------------------------");
			cont1++;
	    }
	}
}
