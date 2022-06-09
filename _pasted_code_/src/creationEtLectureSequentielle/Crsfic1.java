package creationEtLectureSequentielle;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Crsfic1 {

	public static void main(String[] args) throws IOException {
		
		String nomFich;
		int n;
		String m;
		System.out.println("Donnez le nom du fichier a creer : ");
		try (Scanner sc = new Scanner(System.in)) {
			nomFich = sc.nextLine();
			DataOutputStream sortie = new DataOutputStream(new FileOutputStream(nomFich));
			for (int i=0; i<4; i++) {
				if (i%2 == 0) {
					System.out.println("donnez un titre : ");
					m = sc.nextLine();
					sortie.writeChars(m);;
				} else {
					System.out.println("donnez un entier : ");
					n = sc.nextInt();
					sortie.writeInt(n);
				}
			}
			sortie.close();
		}
		System.out.println("*** fin creation fichier ***");

	}

}
