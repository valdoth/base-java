package recursiviteMethode;

import java.util.Scanner;

class Util2 {
	
	public static long fac(long n) {
		long res;
		System.out.println("entree dans la fac : n = " + n);
		if (n <= 1) {
			res = 1;
		} else {
			res = fac(n-1) * n;
		}
		System.out.println("sortie de fac : res = " + res);
		return res;
	}
	
}

public class Factorielle2 {

	public static void main(String[] args) {
		
		int n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("donnez un entier positif : ");
			n = sc.nextInt();
		}
		System.out.println("Voici sa factorielle : " + Util2.fac(n));
		
	}

}
