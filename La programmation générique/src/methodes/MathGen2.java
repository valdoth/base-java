package methodes;

public class MathGen2 {

	static<T> T hasard (T e1, T e2) {
		double x = Math.random();
		if (x < 0.5) {
			return e1;
		} else {
			return e2;
		}
	} 
	
	public static void main(String[] args) {
		Integer n1 = 2;
		Integer n2 = 5;
		int n = hasard(n1, n2);
		System.out.println("hasard (n1, n2) = " + n);
		
		Double x1 = 2.4;
		Number v = hasard(n1, x1);
		System.out.println("hasard (h1, x1) = " + v);
	
		Number w = MathGen2.<Number> hasard(n2, x1);
		System.out.println("hasard (n2, x1) = " + w);
	}

}
