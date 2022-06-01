
public class InstructionsBranchementInconditionnel {

	public static void main(String[] args) {
		
		// L'instruction break ordinaire
		for (int i=1; i<=10; i++) {
			System.out.println("debut tour " + i);
			System.out.println("bonjour");
			if (i == 3) {
				break;
			}
			System.out.println("fin tour " + i);
		}
		System.out.println("apres la boucle");
		System.out.println("------------------------------------");
		
		// L'instruction break avec etiquette
		while (true) {
			System.out.println("debut while");
			repeat:
			for (int i=0; i<=5; i++) {
				System.out.println("debut for " + i);
				for (int j=6; j<=10; j++) {
					System.out.println("debut for " + j);
					if (i == 3) {
						break repeat;
					}
				}
				System.out.println("fin boucle for " + i);
			}
			System.out.println("fin boucle while");
			break;
		}
		System.out.println("--------------------------------------");
		
		// L'instruction continue ordinaire
		for (int i=0; i<=5; i++) {
			System.out.println("debut tour " + i);
			if (i<4) {
				continue;
			}
			System.out.println("apres la boucle");
		}
		System.out.println("-----------------------------------");
		
		// L'instruction continue avec etiquette
		while (true) {
			System.out.println("debut while");
			repeat:
			for (int i=0; i<=5; i++) {
				System.out.println("debut for " + i);
				for (int j=6; j<=10; j++) {
					System.out.println("debut for " + j);
					if (i == 3) {
						continue repeat;
					}
				}
				System.out.println("fin boucle for " + i);
			}
			System.out.println("fin boucle while");
			break;
		}
	}

}
