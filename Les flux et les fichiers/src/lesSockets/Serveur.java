package lesSockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) throws IOException {
		
		int port = 3000;
		try (ServerSocket sersoc = new ServerSocket(port)) {
			while (true) {
				Socket soc = sersoc.accept();
				InputStream flux = soc.getInputStream();
				BufferedReader entree = new BufferedReader(new InputStreamReader(flux));
				String message = entree.readLine();
				System.out.println("message reçu sur le serveur = " + message);
			}
		}
		
	}

}
