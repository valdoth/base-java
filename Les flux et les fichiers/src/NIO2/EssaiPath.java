package NIO2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EssaiPath {

	public static void main(String[] args) throws IOException {

		Path rep1 = Paths.get("/home/ndimbiarisoa/Desktop/pratique java/programmer en java");
		Path rep2 = Paths.get("/home/ndimbiarisoa/Desktop/pratique java/../pratique java/programmer en java");
		Path rep3 = Paths.get("../../../../pratique java/programmer en java");
		Path fic1 = Paths.get("/home/ndimbiarisoa/Desktop/pratique java/programmer en java", "choose.txt");
		System.out.println("rep1 : " + rep1);
		System.out.println("rep2 : " + rep2);
		System.err.println("rep3 : " + rep3);
		System.out.println("fic1 : " + fic1);
		
		// utilisation de methodes syntaxiques
		Path rep2Abs = rep2.toAbsolutePath();
		Path rep2Canonic = rep2.normalize();
		System.out.println("rep2 absolu : " + rep2Abs);
		System.out.println("rep2.canonique : " + rep2Canonic);
		
		Path parentFic1 = fic1.getParent();
		Path parentRep2 = rep2.getParent();
		Path parentRep3 = rep3.getParent();
		Path parentRep2Canonic = rep2Canonic.getParent();
		System.out.println("Parent de fic1 = " + parentFic1);
		System.out.println("Parent de fic2 = " + parentRep2);
		System.out.println("Parent de fic3 = " + parentRep3);
		System.out.println("Parent de rep2 canonique = " + parentRep2Canonic);
		System.out.println("nom fic1 sans chemin = " + fic1.getFileName());
		System.out.println("dernier niveau rep1 = " + rep1.getFileName());
		
		
	}

}
