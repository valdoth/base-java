package constructionEtInitialisation;

public class Point {

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
