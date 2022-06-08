package fluxObjets;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Creation {

	public static void main(String[] args) throws IOException {
		
		ObjectOutputStream sortie = new ObjectOutputStream(new FileOutputStream("points.dat"));
		Point p;
		for (int i=0; i<5; i++) {
			p = new Point(i, 2*i);
			sortie.writeInt(i);
			sortie.writeObject(p);
		}
		sortie.close();
		System.out.println("*** fin creation fichier ***");
	}

}
