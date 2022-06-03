package champsEtMethodesDeClasse;

public class TestMethode {

	public static void main(String[] args) {
		
		MethodeDeClasse a;
		System.out.println("Main 1: nb objet = " + MethodeDeClasse.nbMethodeDeClasse());
		a = new MethodeDeClasse();
		System.out.println("Main 2: nb objet = " + MethodeDeClasse.nbMethodeDeClasse());
		MethodeDeClasse b;
		System.out.println("Main 3: nb objet = " + MethodeDeClasse.nbMethodeDeClasse());
		b = new MethodeDeClasse();
		MethodeDeClasse c = new MethodeDeClasse();
		System.out.println("Main 4: nb objet = " + MethodeDeClasse.nbMethodeDeClasse());
		System.out.println();
		System.out.println(a + " " + b + " " + c);
		
	}

}
