package ensembles;

import java.util.HashSet;
import java.util.Iterator;

public class Ens1 {

	public static void main(String[] args) {

		int [] t = {2, 5, -6, 2, -9, 8, 5};
		HashSet<Integer> ens = new HashSet<>();
		for (int v: t) {
			boolean ajoute = ens.add(v);
			if (ajoute) {
				System.out.println(" On ajoute " + v);
			} else {
				System.out.println(" " + v + " est deja present");
			}
		}
		System.out.print("Ensemble A = ");
		affiche(ens);
		
		Integer cinq = 5;
		boolean enleve = ens.remove(cinq);
		if (enleve) {
			System.out.println(" On supprime 5");
		}
		System.out.print("Ensemble A = ");
		affiche(ens);
		boolean existe = ens.contains(cinq);
		if (!existe) {
			System.out.println(" On ne trouve pas 5");
		}
			
		
	}
	
	public static <E> void affiche(HashSet<E> ens) {
		Iterator<E> iter = ens.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
	}
	
}