package polymorphisme;

public class Pointcol extends Point {

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
