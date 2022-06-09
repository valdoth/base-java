package creationEtLectureSequentielle;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Lecsfic2 {

	public static void main(String[] args) throws IOException {
		String nomfich;
		int n = 0;
		System.out.println("Donnez le nom du fichier a lister : ");
		try (Scanner sc = new Scanner(System.in)) {
			nomfich = sc.nextLine();
		}
		DataInputStream entree = new DataInputStream(new FileInputStream(nomfich));
		System.out.println("valeurs lues dans le fichier " + nomfich + " : ");
		boolean eof = false;
		while (!eof) {
			try {
				n = entree.readInt();
			} catch (EOFException e) {
				eof = true;
			}
			if (!eof) {
				System.out.println(n);
			}
		}
		entree.close();
		System.out.println("*** fin liste fichier ***");
	}
	
}
