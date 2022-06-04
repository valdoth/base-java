package classeInterne;

class Cercle {
	
	class Centre {
		
		public Centre(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public void affiche() {
			System.out.println(x + " " + y);
		}
		
		private int x;
		private int y;
		
	}
	
	public Cercle(int x, int y, double r) {
		c = new Centre(x, y);
		this.r = r;
	}
	
	public void affiche() {
		System.out.print("cercle de rayon " + r + " de centre "); 
		c.affiche();
	}
	
	public void deplace(int dx, int dy) {
		c.x += dx;
		c.y += dy;
	}
	
	private Centre c;
	private double r;
	
}

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle c1 = new Cercle(1, 2, 3.5);
		c1.affiche();
		c1.deplace(4, -2); 
		c1.affiche();
		
	}

}
