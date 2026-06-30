package fordoLista1.java;
import java.util.*;


public class Questao1For1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual base? ");
		int base = s.nextInt();
		int conta = 0;
		
		for(int i = 1 ; i <= 10 ; i++) {
			conta = i * base;
			System.out.println(i + " * " + base + " = " + conta);
		}
		

	}

}
