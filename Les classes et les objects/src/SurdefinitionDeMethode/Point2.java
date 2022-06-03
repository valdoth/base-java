package SurdefinitionDeMethode;

public class Point2 {
	
	public Point2() {
		x = 0;
		y = 0;
	}
	
	public Point2(int abs) {
		x = abs;
	}
	
	public Point2(int abs, int ord) {
		x = abs;
		y = ord;
	}
	
	public void affiche() {
		System.out.println("Coordonees : " + x + " " + y);
	}
	
	private int x;
	private int y;

}
