import java.util.Scanner;

public class InstructionSwitch {

	public static void main(String[] args) {
		
		int n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Donnez un nombre entier: ");
			n = sc.nextInt();
		}
		switch (n) {
			case 0:
				System.out.println("null");
				break;
			case 1:
				System.out.println("un");
				break;
			case 2:
				System.out.println("deux");
				break;
			case 3:
				System.out.println("trois");
				break;
			default:
				System.out.println("grand");
		}
		System.out.println("Au revoir");
	}

}
