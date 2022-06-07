package classeAbstraites;

abstract class Affichable {
	
	abstract public void affichage();
	
}

class Entier extends Affichable {
	
	public Entier(int n) {
		valeur = n;
	}
	
	public void affichage() {
		System.out.println("Je suis un entier de valeur " + valeur);
	}
	
	private int valeur;
	
}

class Flottant extends Affichable {
	
	public Flottant(float x) {
		valeur = x;
	}
	
	public void affichage() {
		System.out.println("Je suis un flottant de valeur " + valeur);
	}
	
	private float valeur;
	
}

public class TestAffichable {

	public static void main(String[] args) {
		
		Affichable[] tab;
		tab = new Affichable[3];
		tab[0] = new Entier(35);
		tab [1] = new Flottant(2.34f);
		tab[2] = new Entier(6);
		
		for (int i=0; i<3; i++) {
			tab[i].affichage();
		}
		
	}

}
