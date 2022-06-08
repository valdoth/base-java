package fluxTexte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestStringTokenizer2 {

	public static void main(String[] args) throws IOException {
		
		String nomfich;
		int nombre, carre;
		System.out.println("donnez le nom du fichier a lister : ");
		try (Scanner sc = new Scanner(System.in)) {
			nomfich = sc.nextLine();
		}
		BufferedReader entree = new BufferedReader(new FileReader(nomfich));
		System.out.println("Nombres et carres contenues dans ce fichier :");
		while (true) {
			String ligneLue = entree.readLine();
			if (ligneLue == null) {
				break;
			}
			StringTokenizer tok = new StringTokenizer(ligneLue, " ");
			nombre = Integer.parseInt(tok.nextToken());
			for (int i=0; i<3; i++) {
				tok.nextToken();
			}
			carre = Integer.parseInt(tok.nextToken());
			System.out.println(nombre + " " + carre);
		}
		entree.close();
		System.out.println("*** fin liste fichier ***");
		
	}

}
