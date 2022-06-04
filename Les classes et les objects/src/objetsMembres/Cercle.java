package objetsMembres;

class Point {
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void affiche() {
		System.out.println("Je suis un point de coordonnees " + x + " " + y);
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

public class Cercle {

	public Cercle(int x, int y, float r) {
		c = new Point(x, y);
		this.r = r;
	}
	
	public void affiche() {
		System.out.println("Je suis un cercle de rayon " + r);
		System.out.println(" et de centre de coordonnees " + c.getX() + " " + c.getY());
	}
	
	public void deplace(int dx, int dy) {
		c.setX(c.getX() + dx);
		c.setY(c.getY() + dy);
	}
	
	private Point c;
	private float r;

}
