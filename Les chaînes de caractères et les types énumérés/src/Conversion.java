
public class Conversion {

	public static void main(String[] args) {
		
		// conversion d'un type primitif en une chaine
		int n = 3948;
		String ch = String.valueOf(n);
		System.out.println(n + " -> " + ch);
		double b = -65.780;
		ch = String.valueOf(b);
		System.out.println(b + " -> " + ch);
		
		
		// Les conversions d'une chaine en un type primitif
		ch = "3458";
		n = Integer.parseInt(ch);
		System.out.println(ch + " -> " + n);
		ch = "3.67e-4";
		double x = Double.parseDouble(ch);
		System.out.println(ch + " -> " + x);
		
		// Conversions entre chaines et tabeaux de caracteres
		char [] mot = {'b', 'o', 'n', 'j', 'o', 'u', 'r'};
		ch = new String(mot);
		for (int i=0; i<mot.length; i++) {
			System.out.println(mot[i]);
		}
		System.out.println("-> " + ch);
		ch = "chaine";
		mot = ch.toCharArray();
		System.out.println(ch + " -> ");
		for (int i=0; i<ch.length(); i++) {
			System.out.println(mot[i]);
		}
		
	}

}
