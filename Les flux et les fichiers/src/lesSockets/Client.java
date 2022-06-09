package lesSockets;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		
		String hote = "127.0.0.1";
		int port = 3000;
		try (Socket soc = new Socket(hote, port)) {
			OutputStream flux = soc.getOutputStream();
			OutputStreamWriter sortie = new OutputStreamWriter(flux);
			sortie.write("message envoye au serveur \n");
			sortie.flush(); // pour forcer l'envoi de la ligne
		}
		
	}

}
