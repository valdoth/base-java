package affectationEtComparaison;

public class TestPoint {

	public static void main(String[] args) {
		
		System.err.println("initialisation de a et b");
		Point a = new Point(3, 5);
		Point b = new Point(2, 0);
		
		a.affiche();
		b.affiche();
		
		System.out.println("affectation a = b");
		a= b;
		a.affiche();
		b.affiche();
		
		System.out.println("Modification de la valeur de y de a");
		a.setY(7);
		a.affiche();
		b.affiche();
		
		System.out.println("reinitialiser la valeur de a et b puis création du point c");
		a = new Point(1, 10);
		b = new Point(2, 20);
		Point c = new Point();
		a.affiche();
		b.affiche();
		c.affiche();
		
		System.out.println("affectation de c=a; a=b; b=c;");
		c = a;
		a = b;
		b = c;
		a.affiche();
		b.affiche();
		c.affiche();
		
		System.out.println();
		System.out.println("notion de clone");
		a = new Point(5, 7);
		b = new Point(8, 9);
		a.affiche();
		b.affiche();
		b = a.copie();
		a.affiche();
		b.affiche();
		b.setX(3);
		a.affiche();
		b.affiche();
		
		
		System.out.println();
		System.out.println("Comparaison d'objets");
		System.out.println("Les opérateur '==' et '!=' s'appliquent théoriquement à des objets");
		System.out.println("Mais comme ils portent sur les références elles-même, leur intérêt est très limité.");
		System.out.println("Ainsi avec Point a, b; l'expression a == b est vraie uniquement si a et b font référence à un seul objet,\net non pas seulement si les valeurs des champs de a et b sont les même.");
		
		
	}

}
