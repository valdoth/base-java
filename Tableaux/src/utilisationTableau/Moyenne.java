package utilisationTableau;

import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
	
		int nbEl;
		int nbElSupMoy = 0;
		double somme = 0;
		double moyenne;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Combien d'eleves :");
			nbEl = sc.nextInt();
		
			double [] notes = new double [nbEl];
			for (int i=0; i<nbEl; i++) {
				System.out.println("donnez la note numero " + (i+1) + " : ");
				notes[i] = sc.nextDouble();
			}
			for (int i=0; i<nbEl; i++) {
				somme += notes[i];
			}
			moyenne = somme / nbEl;
			System.out.println("\nmoyenne de la classe " + moyenne);
			for (int i=0; i<nbEl; i++) {
				if (notes[i] > moyenne) {
					nbElSupMoy++;
				}
			}
			System.out.println(nbElSupMoy + " eleves ont plus de cette moyenne");
		}
		
	}

}
