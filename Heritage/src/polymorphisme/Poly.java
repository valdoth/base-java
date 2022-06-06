package polymorphisme;

public class Poly {

	public static void main(String[] args) {
		
		Point p = new Point(3, 5);
		p.affiche();
		Pointcol pc = new Pointcol(4, 8, (byte)2);
		p = pc;
		p.affiche();
		p = new Point(5, 7);
		p.affiche();
		
	}

}
