import java.util.Scanner;

public class Racines {

	public static void main(String[] args) {

		final int NFOIS = 5;
		double x;
		double racx;
		
		System.out.println("Bonjour");
		System.out.println("Je vais vous caluler " + NFOIS + " racines carrees");
		
		try (Scanner sc = new Scanner(System.in)) {
			for (int i=0; i<NFOIS; i++) {
				System.out.println("Donnez un nombre: ");
				x = sc.nextDouble();
				if (x < 0.0) {
					System.out.println(x + " ne possede pas de racine carree");
				} else {
					racx = Math.sqrt(x);
					System.out.println(x + " a pour racine carree: " + racx);
				}
			}
		}
		
		System.out.println("Travail termine - Au revoir");
	}

}
