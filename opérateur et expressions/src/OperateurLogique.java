
public class OperateurLogique {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 2;
		int c = 4;
		int d = 5;
		
		System.out.println(a<b && c<d);
		System.out.println(a<b || c<d);
		System.out.println(a<b ^ c<d);
		System.out.println(!(a<b));
		
		// L'opérateur ! a une priorité supérieur à celle de tous les opérateurs arithmétiques binaires et 
		// aux opérateurs relationnels.
		a = 3;		b = 3;
		System.out.println(a == b);
		System.out.println(!(a == b));
		
	}

}
