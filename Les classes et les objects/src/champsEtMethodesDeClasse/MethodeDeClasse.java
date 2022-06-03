package champsEtMethodesDeClasse;

public class MethodeDeClasse {
	
	public MethodeDeClasse() {
		System.out.print("++ creation objet MethodeDeClasse");
		nb++;
		System.out.println("il y en a maintenant " + nb);
	}
	
	public static long nbMethodeDeClasse() {
		return nb;
	}
	
	private static long nb = 0;

}
