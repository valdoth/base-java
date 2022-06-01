import java.util.Scanner;

public class InstructionIf {

	public static void main(String[] args) {
		
		double tauxTva = 21.6;
		double ht;
		double ttc;
		double net;
		double tauxR;
		double remise;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Donnez le prix hors taxes: ");
			ht = sc.nextDouble();
			// il faut mettre un "," au lieu d'un "." au moment du saisie d'un type double ou float 
		}
		
		ttc = ht * (1. + tauxTva / 100.);
		if (ttc < 1000.) {
			tauxR = 0;
		} else if (ttc < 2000) {
			tauxR = 1.;
		} else if (ttc < 5000) {
			tauxR = 3.;
		} else {
			tauxR = 5.;
		}
		
		remise = ttc * tauxR / 100.;
		net = ttc - remise;
		
		System.out.println("prix ttc " + ttc);
		System.out.println("remise " + remise);
		System.out.println("net a payer " + net);
		
	}

}
