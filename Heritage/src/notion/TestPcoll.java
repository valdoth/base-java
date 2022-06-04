package notion;

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
		pc.deplace(2, -1);
		pc.affiche();
		Point p = new Point();
		p.initialise(6, 9);
		p.affiche();
		
	}

}
