import java.util.Scanner;

public class OperateurBits {

	public static void main(String[] args) {
		
		// & : et (bit à bit)
		// | : ou inclusif (bit à bit)
		// ^ : ou exclusif (bit à bit)
		// << : décalage à gauche
		// >> : décalage arithmétique à droite
		// >>> : décalage logique à droite
		// ~ : (unaire) complément à un (bit à bit)
		
		
		// exemple d'autorisation des opérateurs de bits
		int n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Donnez un entier: ");
			n = sc.nextInt();
		}
		if ((n & 1) == 1) {
			System.out.println("n est impair");
			System.out.println(45 & 1);
		} else {
			System.out.println("n est pair");
		}
		
	}

}
