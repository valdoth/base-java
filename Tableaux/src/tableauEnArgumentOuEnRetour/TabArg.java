package tableauEnArgumentOuEnRetour;

public class TabArg {

	public static void main(String[] args) {
		
		int [] t = {1, 3, 5, 7};
		System.out.print("avant: ");
		Util.affiche(t);
		Util.raz(t);
		System.out.print("apres: ");
		Util.affiche(t);
		t = Util.suite(8);
		Util.affiche(t);
		
	}

}

class Util {
	
	static void raz(int [] t) {
		for (int i=0; i<t.length; i++) {
			t[i] = 0;
		}
	}
	
	static void affiche(int [] t) {
		for (int i=0; i<t.length; i++) {
			System.out.print(t[i] + " ");
		}
		System.out.println();
	}
	
	public static int [] suite(int n) {
		int [] res = new int[n];
		for (int i=0; i<n; i++) {
			res[i] = i+1;
		}
		return res;
	}
	
}