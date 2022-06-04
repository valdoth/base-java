package EchangeDInformation;

class Point1 {
	
	public Point1(int abs, int ord) {
		x = abs;
		y = ord;
	}
	
	public static boolean coincide(Point1 p1, Point1 p2) {
		return ((p1.x == p2.x) && (p1.y == p2.y));
	}
	
	private int x;
	private int y;

}

public class Coincide2 {

	public static void main(String[] args) {
		
		Point1 a = new Point1(1, 3);
		Point1 b = new Point1(2, 5);
		Point1 c = new Point1(1, 3);
		
		System.out.println("a et b : " + Point1.coincide(a,  b));
		System.out.println("a et c : " + Point1.coincide(a,  c));
		
	}

}
