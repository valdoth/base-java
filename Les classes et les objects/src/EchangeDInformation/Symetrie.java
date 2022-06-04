package EchangeDInformation;

class Point3 {
	
	public Point3(int abs, int ord) {
		x = abs;
		y = ord;
	}
	
	public Point3 symetrique() {
		Point3 res = new Point3(y, x);
		return res;
	}
	
	public void affiche() {
		System.out.println("Coordonees : " + x + " " + y);
	}
	
	private int x;
	private int y;
	
}

public class Symetrie {

	public static void main(String[] args) {
		
		Point3 a = new Point3(1, 2);
		a.affiche();
		Point3 b = a.symetrique();
		b.affiche();
		
	}

}
