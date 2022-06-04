package recursiviteMethode;

import java.util.Scanner;

class Util {
	public static long fac(long n) {
		
		if (n > 1) {
			return (fac(n-1) * n);
		} else {
			return 1;
		}
		
	}
}

public class Factorielle {

	public static void main(String[] args) {
		
		int n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Entrer la valeur de n :");
			n = sc.nextInt();
			System.out.println("Voici sa factorielle : " + Util.fac(n));
		}
		
	}
	
}
