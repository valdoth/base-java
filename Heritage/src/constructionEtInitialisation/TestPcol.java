package constructionEtInitialisation;

class Pointcol extends Point {
	
	public Pointcol(int x, int y, byte couleur) {
		super(x, y);
		this.couleur = couleur;
	}
	
	public void affiche() {
		super.affiche();
		System.out.println(" et ma couleur est : " + couleur);
	}
	
	private byte couleur;
	
}

public class TestPcol {

	public static void maicn(String[] args) {
		
		Pointcol pc1 = new Pointcol(3, 5, (byte)3);
		pc1.affiche();
		
		Pointcol pc2 = new Pointcol(5, 8, (byte)2);
		pc2.affiche();
		pc2.deplace(1, -3);
		pc2.affiche();
		
	}

}
