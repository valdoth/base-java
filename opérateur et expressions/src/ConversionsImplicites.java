public class ConversionsImplicites {

	public static void main(String[] args) {
		
		// les conversions d'ajustement de type
		// int -> long -> float -> double
		// on peut surement convertir un int en double mais 
		// en revanche on ne pourra pas convertir un double en float
		
		int n = 4;
		long p = 5;
		double x = 2;
		System.out.println(n * p + x);
		
		// les opérateur numérique ne sont pas définis pour les types bytes, char et short
		// Java convertie les bytes et short en int, et cela sans considérer les types des eventuels autres opérandes
		// on parle alors de promotions numériques (ou encore de conversions systématiques)
		
		short p1 = 3;
		short p2 = 5;
		short p3 = 8;
		float x1 = 3.5f;
		System.out.println(p1 * p2 + p3 * x1);
		
		// Le type char est convertie en type int
		char c = 'T';
		int r = 4;
		System.out.println(c + r);
		
	}

}
