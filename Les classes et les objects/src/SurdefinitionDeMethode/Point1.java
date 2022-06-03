package SurdefinitionDeMethode;

public class Point1 {

	public Point1(int abs, int ord) {
		setX(abs);
		setY(ord);
	}
	
	public void affiche() {
		System.out.println("au point(" + getX() + ", " + getY() + ")");
	}
	
	public void deplace(int dx, int dy) {
		setX(getX() + dx);
		setY(getY() + dy);
	}
	
	public void deplace(int dx) {
		setX(getX() + dx);
	}
	
	public void deplace(short dx) {
		setX(getX() + dx);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	private int x;
	private int y;
	
}
