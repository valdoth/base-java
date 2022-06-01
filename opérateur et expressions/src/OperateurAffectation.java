public class OperateurAffectation {

	public static void main(String[] args) {
		
		// affectatoin de la valeur 7 à j
		int j = 7;
		System.out.println(j);
		
		// associativité de gauche à droite
		int i = j = 5;
		System.out.println(i + " " + j);
		
		// conversions affectation
		int n = 5;
		float x = n;
		System.out.println(n + " " + x);
		
		// les deux hiérarchies
		// byte -> short -> int -> long -> float -> double
		// char -> int -> long -> float -> double
		
		
		// perte de précision dans la conversion int -> float
		int a = 1234;
		float b = n;
		System.out.println("a: " + a + ", b: " + b);
		a = 123456789;
		b = a;
		System.out.println("a: " + a + ", b: " + b);
		int c = (int)b;
		System.out.println("a: " + a + ", c: " + c);
		System.out.println("c - a = " + (c - a));
	}

}
