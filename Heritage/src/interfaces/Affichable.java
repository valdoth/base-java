package interfaces;

public interface Affichable {
	
	default void affiche() {
		System.out.println("Je suis un entier affichable");
	}
	
	
	float getValeur();
	
	static final int MAXI = 76;

	void afficheConstante();
	
}
