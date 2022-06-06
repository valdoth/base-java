package polymorphisme;

public class TabHeter {

	public static void main(String[] args) {
		
		Point [] tabPts = new Point[4];
		tabPts[0] = new Point(0, 2);
		tabPts[1] = new Pointcol(1, 5, (byte)3);
		tabPts[2] = new Pointcol(2, 8, (byte)9);
		tabPts[3] = new Point(1, 2);
		
		for(int i=0; i<tabPts.length; i++) {
			tabPts[i].affiche();
		}
		
	}

}
