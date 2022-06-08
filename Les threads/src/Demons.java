import java.util.Scanner;

public class Demons {

	public static void main(String[] args) {
		Ecrit3 e1 = new Ecrit3("Bonjour ", 5);
		Ecrit3 e2 = new Ecrit3("Bonsoir ", 10);
		Ecrit3 e3 = new Ecrit3("\n", 35);
		e1.setDaemon(true);
		e1.start();
		e2.setDaemon(true);
		e2.start();
		e3.setDaemon(true);
		e3.start();
		
		try (Scanner sc = new Scanner(System.in)) {
			sc.nextLine();
		}
	}
	
	
}

class Ecrit3 extends Thread {
	public Ecrit3(String texte, long attente) {
		this.texte = texte;
		this.attente = attente;
	}
	
	public void run() {
		try {
			while(true) {
				if (interrupted()) {
					return;
				}
				System.out.println(texte);
				sleep(attente);
			}
		} catch(InterruptedException e) {
			return;
		}
	}
	
	private String texte;
	private long attente;
}