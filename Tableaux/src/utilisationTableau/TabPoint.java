package utilisationTableau;

public class TabPoint {

	public static void main(String[] args) {
		
		Point [] tp = new Point[3];
		tp[0] = new Point(1, 2);
		tp[1] = new Point(4, 5);
		tp[2] = new Point(8, 9);
		for (int i=0; i<tp.length; i++) {
			tp[i].affiche();
		}
		
		char [] tc = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(tc);
		
	}

}

class Point {
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void affiche() {
		System.out.println("Point : " + x + ", " + y);
	}
	
	private int x;
	private int y;
	
}