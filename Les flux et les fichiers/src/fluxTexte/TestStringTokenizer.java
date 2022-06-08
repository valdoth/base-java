package fluxTexte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestStringTokenizer {

	public static void main(String[] args) throws IOException {
		
		String nomfich;
		double x, som = 0;
		System.out.println("donnez le nom du fichier a lister : ");
		try (Scanner sc = new Scanner(System.in)) {
			nomfich = sc.nextLine();
		}
		BufferedReader entree = new BufferedReader(new FileReader(nomfich));
		System.out.println("Flottants contenus dans le fichier " + nomfich + " :");
		while (true) {
			String ligneLue = entree.readLine();
			if (ligneLue == null) {
				break;
			}
			StringTokenizer tok = new StringTokenizer(ligneLue, " ");
			int nv = tok.countTokens();
			for (int i=0; i<nv; i++) {
				x = Double.parseDouble(tok.nextToken());
				som += x;
				System.err.println(x + " ");
			}
		}
		entree.close();
		System.out.println("somme des nombres dans le fichier = " + som);
		System.out.println("*** fin liste fichier ***");
		
	}

}
