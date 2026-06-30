package fordoLista1.java;
import java.util.*;

public class Questao10For1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int cand = 2;
		int comerA = 0; //aptos
		int indA = 0;
		int gerenA = 0;
		int operA = 0;
		
		int comerI = 0; //inaptos
		int indI = 0;
		int gerenI = 0;
		int operI = 0;
		
		int totalC = 0;
		int totalI = 0;
		
		int residir = 0;
		//30 candidatos
		//exigencia comercio = 1 ano morando na cidade, 2o grau completo e ter exp comprovada
		
		for(cand = 2 ; cand >= 0 ; cand--) {
			System.out.println("Voce mora na cidade? [S] ou [N] ");
			String moraC = s.next();
			
			if(moraC.equalsIgnoreCase("S")) {
				System.out.println("Há quanto tempo voce vive na cidade? Em anos ");
				residir += s.nextInt();
			}
			
			System.out.println("Voce tem segundo grau completo? [S] ou [N] ");
			String grauC = s.next();
			
			System.out.println("Voce tem exp comprovada? [S] ou [N] ");
			String exp = s.next();
			
			System.out.println("Voce tem curso superior? [S] ou [N] ");
			String cursoS = s.next();
			
			if(moraC.equalsIgnoreCase("S") && residir >= 1 && grauC.equalsIgnoreCase("S") && exp.equalsIgnoreCase("S") && moraC.equalsIgnoreCase("S")) {
				comerA++;
				totalC++;
				System.out.println("Candidato apto para comercio ");
			}
			else
				if(residir < 1 || grauC.equalsIgnoreCase("N") || exp.equalsIgnoreCase("N")) {
					comerI++;
					totalC++;
					System.out.println("Candidato inapto para comercio, motivo: ");
				}
			
				if(grauC.equalsIgnoreCase("S") && exp.equalsIgnoreCase("N") || exp.equalsIgnoreCase("N") && cursoS.equalsIgnoreCase("N") || cursoS.equalsIgnoreCase("N")) {
					operA++;
					totalI++;
					System.out.println("Candidato apto para operario ");
			}
				else {
					if(grauC.equalsIgnoreCase("N") || exp.equalsIgnoreCase("N") || cursoS.equalsIgnoreCase("N")) {
						operI++;
						totalI++;
						System.out.println("Candidato inapto para operario ");
					}
			}
					if(cursoS.equalsIgnoreCase("S") && grauC.equalsIgnoreCase("S") && exp.equalsIgnoreCase("S")) {
							gerenA++;
							totalI++;
							System.out.println("Candidato apto para gerencia ");
			}
					else 
						if(cursoS.equalsIgnoreCase("N") || grauC.equalsIgnoreCase("N") || exp.equalsIgnoreCase("N")) {
							gerenI++;
							totalI++;
							System.out.println("Candidato inapto para gerencia ");
				}
		}
		
		double percC = (totalC / 3.0) * 100.0;
		double percI = (totalI / 3.0) * 100.0;
		
		System.out.println("A qntd de candidatos para comercio: " + totalC);
		System.out.println("A qntd de candidatos para industria: " + totalI);
		System.out.println("O percentual da area de comer foi: " +  percC + "%, e da industria: " + percI + "%");
		System.out.println("Foram computados: " + totalC + " no comercio e " + (totalI) + " na area de industria");
	}
}
