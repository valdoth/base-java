package creationEtLectureSequentielle;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class AccessDirect {

	public static void main(String[] args) throws IOException {
		
		String nomfich;
		int n, num;
		RandomAccessFile entree;
		System.out.println("Donnez le nom du fichier a consulter : ");
		try (Scanner sc = new Scanner(System.in)) {
			nomfich = sc.nextLine();
			entree = new RandomAccessFile(nomfich, "r");
			long taille = entree.length();
			while (true) {
				System.out.println("Numero de l'entier recherche : ");
				num = sc.nextInt();
				if (num == 0) {
					break;
				}
				int rang = 4 * (num - 1);
				if (rang >= 0 && rang < taille) {
					entree.seek(rang);
					n = entree.readInt();
					System.out.println(" valeur = " + n);
				} else {
					System.out.println("entier inexistant");
					continue;
				}
			}
		}
		entree.close();
		System.out.println("*** fin consultation fichier ***");
		
	}

}
