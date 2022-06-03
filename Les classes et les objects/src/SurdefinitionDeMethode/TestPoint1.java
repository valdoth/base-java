package SurdefinitionDeMethode;

public class TestPoint1 {

	public static void main(String[] args) {
		
		Point1 a = new Point1(1, 2);
		a.affiche();
		a.deplace(1, 3);	// appelle deplace(int, int)
		a.affiche();
		a.deplace(2);		// appelle deplace(int)
		a.affiche();
		short p = 3;
		a.deplace(p);		// appelle deplace(short)
		a.affiche();
		byte b = 2;
		a.deplace(b);		// appelle deplace(short) apres conversion de b en short
		a.affiche();
		
	}

}
