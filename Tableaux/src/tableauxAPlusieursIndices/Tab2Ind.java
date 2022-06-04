package tableauxAPlusieursIndices;

class Util {
	
	static void raz(int [][] t) {
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t[i].length; j++) {
				t[i][j] = 0;
			}
		}
	}
	
	static void affiche(int [][] t) {
		for (int i=0; i<t.length; i++) {
			System.out.print("ligne de rang " + i + " = ");
			for (int j=0; j<t[i].length; j++) {
				System.out.print(t[i][j] + " ");
				
			}
			System.out.println();
		}
	}
	
}

public class Tab2Ind {

	public static void main(String[] args) {
		
		int [][] t = { {1, 2, 3}, {11, 12}, {21, 22, 23, 24} };
		System.out.println("t avant raz :");
		Util.affiche(t);
		Util.raz(t);
		System.out.println("t apres raz :");
		Util.affiche(t);
	
	}

}
