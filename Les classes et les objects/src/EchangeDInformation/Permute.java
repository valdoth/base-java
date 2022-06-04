package EchangeDInformation;

class Point2 {
	
	public Point2(int abs, int ord) {
		x = abs;
		y = ord;
	}
	
	public void permute(Point2 a) {
		Point2 c = new Point2(0, 0);
		c.x = a.x;
		c.y = a.y;
		a.x = x;
		a.y = y;
		x = c.x;
		y = c.y;
	}
	
	public void affiche() {
		System.out.println("Coordonees : " + x + " " + y);
	}
	
	private int x;
	private int y;
	
}

public class Permute {

	public static void main(String[] args) {
		
		Point2 a = new Point2(1, 2);
		Point2 b = new Point2(5, 6);
		System.out.println("avant utilisation de permute");
		System.out.print("a : ");
		a.affiche();
		System.out.print("b : ");
		b.affiche();
		a.permute(b);
		System.out.println("apres utilisation de permute");
		System.out.print("a : ");
		a.affiche();
		System.out.print("b : ");
		b.affiche();
		
	}

}
