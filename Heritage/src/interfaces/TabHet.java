package interfaces;

class Entier implements Affichable {
	
	public Entier(int n) {
		valeur = n;
	}
	
	public void afficheConstante() {
		System.out.println("La valeur de MAXI : " + MAXI + " est accessible dans une classe implementant l'interface.");
	} 
	
	public float getValeur() {
		return valeur;
	}
	
	private int valeur;
}

class Flottant implements Affichable {
	
	public Flottant(float x) {
		valeur = x;
	}
	
	public void affiche() {
		System.out.println("Je suis un flottant ");
	}
	
	public float getValeur() {
		return valeur;
	}
	
	private float valeur;

	public void afficheConstante() {
		System.out.println("La valeur de MAXI : " + MAXI + " est accessible dans une classe implementant l'interface.");
	}
	
}

public class TabHet {

	public static void main(String[] args) {
		
		Affichable [] tab = new Affichable[3];
		tab[0] = new Entier(25);
		tab[1] = new Flottant(3.8f);
		tab[2] = new Entier(4);
		
		for (int i=0; i<tab.length; i++) {
			tab[i].affiche();
			if (tab[i].getValeur() == (int)tab[i].getValeur()) {
				tab[i].afficheConstante();
			}
		}
	}

}
