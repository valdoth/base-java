package notionConstructeur;

public class Point {

	public Point() {
		this(0, 0);
	}
	
	public Point(int abs, int ord) {
		x = abs;
		y = ord;
	}
	
	public void deplace(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public void affiche() {
		System.out.println("Je suis un point de coordonnees (" + x + ", " + y + ")");
	}
	
	private int x;
	private int y;
	
}
