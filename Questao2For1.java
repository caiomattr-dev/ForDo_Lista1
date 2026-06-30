package fordoLista1.java;
import java.util.*;

public class Questao2For1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int negativos = 0;
		
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("Digite 1 número: ");
			int num = s.nextInt();
			if(num < 0) 
				negativos++;
		}
		System.out.println("Numeros negativos: " + negativos);

	}

}
