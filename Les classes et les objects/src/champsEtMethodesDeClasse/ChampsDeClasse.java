package champsEtMethodesDeClasse;

public class ChampsDeClasse {

	public ChampsDeClasse() {
		System.out.print("++ creation objet champ de classe: ");
		nb++;
		System.out.println(" il y a maintenant " + nb);
	}
	private static long nb = 0;
	
}
