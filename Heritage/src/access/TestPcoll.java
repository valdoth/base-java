package access;

class Point {
	
	public void initialise(int abs, int ord) {
		x = abs;
		y = ord;
	}
	
	public void deplace(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public void affiche() {
		System.out.println("Je suis en " + x + " " + y);
	}
	
	private int x;
	private int y;

}

class Pointcol extends Point {
	
	public void colore(byte couleur) {
		this.setCouleur(couleur);
	}
	
	public void affichec() {
		affiche();
		System.out.println(" et ma couleur est : " + couleur);
	}
	
	public void initialisec(int x, int y, byte couleur) {
		initialise(x, y);
		this.couleur = couleur;
	}
	
	public byte getCouleur() {
		return couleur;
	}

	public void setCouleur(byte couleur) {
		this.couleur = couleur;
	}

	private byte couleur;

}

public class TestPcoll {

	public static void main(String[] args) {
		
		Pointcol pc = new Pointcol();
		pc.affiche();
		pc.initialise(3, 5);
		pc.affiche();
		pc.colore((byte) 3);
		pc.affiche();
		pc.affichec();
		pc.deplace(2, -1);
		pc.affiche();
		Pointcol pc2 = new Pointcol();
		pc2.initialisec(2, 8, (byte) 2);
		pc2.affiche();
		pc2.deplace(1, -3);
		pc2.affichec();
		
	}

}
