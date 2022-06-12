package ensembles;

import java.util.HashSet;

public class Ens3 {

	public static void main(String[] args) {
		String phrase = "je ne figure ce zouave qui joue";
		String voy = "aeiouy";
		HashSet<String> lettres = new HashSet<>();
		for (int i=0; i<phrase.length(); i++) {
			lettres.add(phrase.substring(i, i+1));
		}
		System.out.println("lettres presentes : " + lettres);
		HashSet<String> voyelles = new HashSet<>();
		for (int i=0; i<voy.length(); i++) {
			voyelles.add(voy.substring(i, i+1));
		}
		lettres.removeAll(voyelles);
		System.out.println("lettres sans les voyelles : " + lettres);
	}

}
