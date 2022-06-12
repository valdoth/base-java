package ensembles;

import java.util.Iterator;
import java.util.TreeSet;

public class EnsPt2 {

	public static void main(String[] args) {
		
		Point1 p1 = new Point1(1, 3);
		Point1 p2 = new Point1(2, 2);
		Point1 p3 = new Point1(4, 5);
		Point1 p4 = new Point1(1, 8);
		Point1 [] p = {p1, p2, p1, p3, p4, p3};
		TreeSet<Point1> ens = new TreeSet<>();
		for (Point1 px: p) {
			System.out.print("le point ");
			px.affiche();
			boolean ajoute = ens.add(px);
			if (ajoute) {
				System.out.println(" a ete ajoute");
			} else {
				System.out.println(" est deja present");
			}
			System.out.print("ensemble = ");
			affiche(ens);
		}
		
	}
	
	public static void affiche(TreeSet<Point1> ens) {
		Iterator<Point1> iter = ens.iterator();
		while (iter.hasNext()) {
			Point1 p = iter.next();
			p.affiche();
		}
		System.out.println();
	}
	
}

@SuppressWarnings("rawtypes")
class Point1 implements Comparable {
	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int compareTo(Object pp) {
		Point1 p = (Point1) pp;
		if (this.x < p.x) {
			return -1;
		} else if (this.x > p.x) {
			return 1;
		} else if (this.y < p.y) {
			return -1;
		} else if (this.y > p.y) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public void affiche() {
		System.out.print("[" + x + ", " + y + "]");
	}
	
	private int x;
	private int y;
}