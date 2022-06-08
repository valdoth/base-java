package fluxObjets;

import java.io.Serializable;

class Point implements Serializable {
	private static final long serialVersionUID = 1L;
	public Point(int abs, int ord) {
		x = abs;
		y = ord;
	}
	
	public void affiche() {
		System.out.println("Coordonees = " + x + " " + y);
	}
	
	private int x;
	private int y;
}
