package fordoLista1.java;
import java.util.Scanner;

public class Questao3For1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numP = 0;
		int positivo = 0;
		int neg = 0;
		int inter = 0;
		double media = 0;
		
		for(int i = 1 ; i <=10 ; i++) {
			System.out.println("Insira 1 valores: ");
			int valores = s.nextInt();
			
			if(valores > 0) {
				numP += valores;
				positivo++;
				}
			
			if(valores < 0) {
				neg ++;
			}
			
			if(valores >= 5 && valores <= 50) {
				inter++;
			}
		}
		
		media = numP / positivo;
		System.out.println("A media deu: " + media);
		System.out.println("A qtnd de menores do q 0: " + neg);
		System.out.println("No intervalo: " + inter);
	}

}
