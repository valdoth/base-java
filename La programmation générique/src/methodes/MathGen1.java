package methodes;

public class MathGen1 {

	static<T> T hasard(T [] valeurs) {
		int n = valeurs.length;
		if (n == 0) {
			return null;
		}
		int i = (int)(n * Math.random());
		return valeurs[i];
	}
	
	public static void main(String[] args) {
		Integer[] tab = {1, 5, 8, 4, 9};
		System.out.println("hasard sur tab = " + hasard(tab));
		String [] tabs = {"bonjour", "salut", "hello"};
		System.out.println("hasard sur tabs = " + hasard(tabs));
	}

}
