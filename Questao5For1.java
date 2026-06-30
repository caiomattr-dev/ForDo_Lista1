package fordoLista1.java;
import java.util.Scanner;

public class Questao5For1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int primo = 0;
		
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("Insira 1 valor: ");
			int valor = s.nextInt();

			if(valor ==2)
				primo++;
			
			if(valor ==3)
				primo++;
			
			if(valor ==5)
				primo++;
			
			if(valor % 2 !=0 && valor % 3 != 0 && valor % 5 != 0 && valor != 1)
				primo++;

				
		}
		System.out.println("qtd primo: " + primo);
		
		

	}

}
