package EchangeDInformation;

class Point4 {
	
	public Point4() {
		// L'appel this(...) doit obligatoirement être la première instruction du constructeur. 
		this(0, 0);
		System.out.println("constructeur sans arguments");
	}
	
	public Point4(int y, int x) {
		this.x = x;
		this.y = y;
		System.err.println("constructeur avec deux arguments: " + x + " " + y);
	}
	
	public void affiche() {
		System.out.println("Coordonees : " + x + " " + y);
	}
	
	private int x;
	private int y;
	
}

public class ConsThis {

	public static void main(String[] args) {
		
		Point4 a = new Point4();
		a.affiche();
		Point4 b = new Point4(1, 2);
		b.affiche();
		
	}

}
