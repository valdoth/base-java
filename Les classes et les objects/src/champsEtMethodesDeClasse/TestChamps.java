package champsEtMethodesDeClasse;

public class TestChamps {

	public static void main(String[] args) {
		
		ChampsDeClasse a;
		System.out.println("Main 1");
		a = new ChampsDeClasse();
		System.out.println("Main 2");
		ChampsDeClasse b;
		System.out.println("Main 3");
		b = new ChampsDeClasse();
		ChampsDeClasse c = new ChampsDeClasse();
		System.out.println("Main 4");
		
		System.out.println(a + " " + b + " " + c);
		
	}

}
