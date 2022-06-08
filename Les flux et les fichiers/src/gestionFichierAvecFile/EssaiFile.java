package gestionFichierAvecFile;

import java.io.File;
import java.io.IOException;

public class EssaiFile {

	public static void main(String[] args) throws IOException {
		
		File rep1 = new File("/home/ndimbiarisoa/Desktop/pratique java/programmer en java");
		File rep2 = new File("/home/ndimbiarisoa/Desktop/pratique java/../pratique java/programmer en java");
		File rep3 = new File("../../../../pratique java/programmer en java");
		File fic1 = new File(rep1, "choose.txt");
		System.out.println("rep1 : " + rep1);
		System.out.println("rep2 : " + rep2);
		System.err.println("rep3 : " + rep3);
		System.out.println("fic1 : " + fic1);
		
		// utilisation de methodes syntaxiques
		File rep2Abs = rep2.getAbsoluteFile();
		File rep2Canonic = rep2.getCanonicalFile();
		System.out.println("rep2 absolu : " + rep2Abs);
		System.out.println("rep2.canonique : " + rep2Canonic);
		
		File parentFic1 = fic1.getParentFile();
		File parentRep2 = rep2.getParentFile();
		File parentRep3 = rep3.getParentFile();
		File parentRep2Canonic = rep2Canonic.getParentFile();
		System.out.println("Parent de fic1 = " + parentFic1);
		System.out.println("Parent de fic2 = " + parentRep2);
		System.out.println("Parent de fic3 = " + parentRep3);
		System.out.println("Parent de rep2 canonique = " + parentRep2Canonic);
		System.out.println("nom fic1 sans chemin = " + fic1.getName());
		System.out.println("dernier niveau rep1 = " + rep1.getName());
		
		
		// utilisation de methodes d'information
		System.out.println("existence de rep1 = " + rep1.exists());
		System.out.println("rep1 est un fichier = " + rep1.isFile());
		System.out.println("rep1 est un repertoire = " + rep1.isDirectory());
		System.out.println("existence fic1 = " + fic1.exists());
		System.out.println("taille fic1 = " + fic1.length());
		System.out.println("ecriture fic1 autorisee = " + fic1.canWrite());
		
	}

}
