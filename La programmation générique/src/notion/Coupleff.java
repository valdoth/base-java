package notion;

public class Coupleff {

	public static void main(String[] args) {
		Integer oi1 = 3;
		Integer oi2 = 5;
		Couple <Integer> ci = new Couple<Integer>(oi1, oi2);
		ci.affiche();
		
		Integer c = ci.getSecond();
		System.out.println("deuxieme element du couple ci = " + c);
		
		Couple<Double> cd = new Couple<Double>(2.0, 12.0);
		cd.affiche();
		
		Double p = cd.getPremier();
		System.out.println("premier element du couple cd = " + p);
	}
	
}


class Couple<T> {
	private T x;
	private T y;
	
	public Couple(T premier, T second) {
		x = premier;
		y = second;
	}
	
	public T getPremier() {
		return x;
	}
	public T getSecond() {
		return y;
	}
	
	public void affiche() {
		System.out.println("premiere valeur : " + x + " - deuxieme valeur : " + y);
	}
}