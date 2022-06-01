package notionConstructeur;

public class TestPoint {

	public static void main(String[] args) {
		
		Point a = new Point(3, 5);
		a.affiche();
		a.deplace(4, 9);
		a.affiche();
		
		Point b = new Point();
		b.affiche();
		b.deplace(6, 8);
		b.affiche();
		
	}

}
