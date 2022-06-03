package EchangeDInformation;

class Util {
	public static void Echange(int a, int b) {
		System.out.println("debut Echange: " + a + " " + b);
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("fin Echange: " + a + " " + b);
	}
}

public class Echange {

	public static void main(String[] args) {
		int n = 10;
		int p = 20;
		System.out.println("avant appel : " + n + " " + p);
		Util.Echange(n, p);
		System.out.println("apres appel : " + n + " " + p);
	}
	
}
