package notion;

public class CoupleM {
	public static void main(String[] args) {
		Integer oi1 = 3;
		Double oi2 = 5.3;
		Couple1 <Integer, Double> ci = new Couple1<Integer, Double>(oi1, oi2);
		ci.affiche();
		
		Double c = ci.getSecond();
		System.out.println("deuxieme element du couple ci = " + c);
		
		Couple1<Double, Double> cd = new Couple1<Double, Double>(2.0, 12.0);
		cd.affiche();
		
		Double p = cd.getPremier();
		System.out.println("premier element du couple cd = " + p);
	}
	
} 


class Couple1<T, U> {
	private T x;
	private U y;
	
	public Couple1(T premier, U second) {
		x = premier;
		y = second;
	}
	
	public T getPremier() {
		return x;
	}
	public U getSecond() {
		return y;
	}
	
	public void affiche() {
		System.out.println("premiere valeur : " + x + " - deuxieme valeur : " + y);
	}
}