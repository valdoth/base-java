package fluxTexte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LectureFichiertxt1 {

	public static void main(String[] args) throws IOException {
		
		String nomfich;
		String ligne;
		System.out.println("Donnez le nom du fichier a lister : ");
		try (Scanner sc = new Scanner(System.in)) {
			nomfich = sc.nextLine();
		}
		BufferedReader entree = new BufferedReader(new FileReader(nomfich));
		while(true) {
			ligne = entree.readLine();
			if (ligne != null) {
				System.out.println(ligne);
			} else {
				break;
			}
		}
		entree.close();
		System.out.println("*** fin liste fichier ***");
		
	}

}
