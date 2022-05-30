public class TypesCaracteres {

	public static void main(String[] args) {
		
		char s = 'a';
		System.out.println(s);
		
		final char carDeb = 200;
		final char carFin = 6553;
		
		for (char c = carDeb; c < carFin; c++) {
			System.out.print((int)c + " -> ");
			System.out.print(c + "; ");
		}
		
	}

}
