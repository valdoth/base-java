package declarationEtCreation;

import java.util.Scanner;

public class Introduction {

	public static void main(String[] args) {
		
		int [] t;
		int n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("taille voulue ? ");
			n = sc.nextInt();
			t = new int [n];
			for (int i=0; i<n; i++) {
				t[i] = i;
			}
			for (int i=0; i<n; i++) {
				System.out.print(t[i] + " ");
			}
		}
		System.out.println();
		System.out.println("----------------------------------");
		int a = 6;
		int b = 7;
		int [] s = {1, a, a+b, 2*b, 12};
		for (int i=0; i<s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		
	}

}
