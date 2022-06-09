package NIO2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisit {

	public static void main(String[] args) throws IOException {
		
		Path p = Paths.get("/home/ndimbiarisoa/Desktop/pratique java/programmer en java");
		AffichRepert ar = new AffichRepert();
		Files.walkFileTree(p, ar);
		
	}

}

class AffichRepert extends SimpleFileVisitor<Path> {
	public FileVisitResult visitFile(Path fich, BasicFileAttributes attr) {
		// on entre ici a chaque fichier visite
		if (attr.isRegularFile()) {
			System.out.println(fich.getFileName());
		}
		return FileVisitResult.CONTINUE;
	}
}