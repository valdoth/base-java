package elementsConception;

public class Point {

	public Point() {
		this(0, 0);
	}
	
	public Point(int abs, int ord) {
		setX(abs);
		setY(ord);
	}
	
	public void deplace(int dx, int dy) {
		setX(x + dx);
		setY(y + dy);
	}
	
	public void affiche() {
		System.out.println("Je suis un point de coordonnees (" + getX() + ", " + getY() + ")");
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	private int x;
	private int y;
	
}
