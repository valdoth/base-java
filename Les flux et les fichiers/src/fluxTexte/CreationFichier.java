package fluxTexte;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreationFichier {

	public static void main(String[] args) throws IOException {
		
		String nomfich;
		int n;
		System.out.println("Donnez le nom du fichier a creer : ");
		try (Scanner sc = new Scanner(System.in)) {
			nomfich = sc.nextLine();
			PrintWriter sortie = new PrintWriter(new FileWriter(nomfich));
			while(true) {
				System.out.println("donnez un entier : ");
				n = sc.nextInt();
				if (n!=0) {
					sortie.println(n + " a pour carre " + n*n);
				} else {
					break;
				}
			}
			sortie.close();
			System.out.println("*** fin creation fichier ***");
		}
		
	}

}
