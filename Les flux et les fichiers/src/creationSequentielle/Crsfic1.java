package creationSequentielle;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Crsfic1 {

	public static void main(String[] args) throws IOException {
		
		String nomFich;
		int n;
		System.out.println("Donnez le nom du fichier a creer : ");
		try (Scanner sc = new Scanner(System.in)) {
			nomFich = sc.nextLine();
			DataOutputStream sortie = new DataOutputStream(new FileOutputStream(nomFich));
			while(true) {
				System.out.println("donnez un entier : ");
				n = sc.nextInt();
				if (n != 0) {
					sortie.writeInt(n);
				} else {
					break;
				}
			}
			sortie.close();
		}
		System.out.println("*** fin creation fichier ***");

	}

}
