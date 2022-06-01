package notionClasse;

public class TestPoint {

	public static void main(String[] args) {
		
		Point a = new Point();
		a.affiche();
		a.initialise(3, 5);
		a.affiche();
		a.deplace(2, 0);
		a.affiche();
		
		Point b = new Point();
		b.initialise(6, 8);
		b.affiche();
		
	}

}
