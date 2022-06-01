import java.util.Scanner;

public class InstructionWhile {

	public static void main(String[] args) {
		
		int n;
		int som = 0;
		try (Scanner sc = new Scanner(System.in)) {
			while (som < 100) {
				System.out.println("entre une valeur: ");
				n = sc.nextInt();
				som += n;
			}
		}
		System.out.println("Somme obtenu: " + som);
		
	}

}
