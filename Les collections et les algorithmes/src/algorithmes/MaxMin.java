package algorithmes;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MaxMin {

	public static void main(String[] args) {
		
		Point p1 = new Point(1, 3);
		Point p2 = new Point(2, 1);
		Point p3 = new Point(5, 2);
		Point p4 = new Point(3, 2);
		
		LinkedList<Point> l = new LinkedList<Point>();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		
		@SuppressWarnings("unchecked")
		Point pMax1 = (Point) Collections.max(l);
		System.out.print("Max suivant compareTo = ");
		pMax1.affiche();
		
		Point pMax2 = (Point) Collections.max(l, new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				Point p1 = (Point) o1;
				Point p2 = (Point) o2;
				if (p1.y < p2.y) {
					return -1;
				} else if (p1.y == p2.y) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		
		System.out.print("Max suivant comparator = ");
		pMax2.affiche();
		
	}

}

@SuppressWarnings("rawtypes")
class Point implements Comparable {
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int compareTo(Object pp) {
		Point p = (Point) pp;
		if (this.x < p.x) {
			return -1;
		} else if (this.x == p.x) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public void affiche() {
		System.out.println("[" + x + ", " + y + "]");
	}
	
	public int x;
	public int y;
}