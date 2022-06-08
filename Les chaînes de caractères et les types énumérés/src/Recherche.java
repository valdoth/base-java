import java.util.Scanner;

public class Recherche {

	public static void main(String[] args) {
		
		String mot = "anticonstitutionnellement";
		int n;
		n = mot.indexOf('t');
		System.out.println(n);
		n = mot.lastIndexOf('t');
		System.out.println(n);
		n = mot.indexOf("ti");
		System.out.println(n);
		n = mot.indexOf("tion");
		System.out.println(n);
		
		final char car = 'e';
		int posCar = 0;
		int nbCar = 0;
		String ch;
		System.out.println("Donnez un mot : ");
		try (Scanner sc = new Scanner(System.in)) {
			ch = sc.nextLine();
		}
		int i = 0;
		while(posCar >= 0) {
			posCar = ch.indexOf(car, i);
			if (posCar >= 0) {
				nbCar++;
				i = posCar + 1;
			}
		}
		System.out.println("Votre mot comporte " + nbCar + " fois le caractere : " + car);
	}

}
