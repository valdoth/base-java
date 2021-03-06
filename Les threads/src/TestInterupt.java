import java.util.Scanner;

public class TestInterupt {

	public static void main(String[] args) {
		Ecrit2 e1 = new Ecrit2("Bonjour ", 5);
		Ecrit2 e2 = new Ecrit2("Bonsoir ", 10);
		Ecrit2 e3 = new Ecrit2("\n", 35);
		e1.start();
		e2.start();
		e3.start();
		
		try (Scanner sc = new Scanner(System.in)) {
			sc.nextLine();
			e1.interrupt();
			System.out.println("\n*** Arret premier thread ***");
			sc.nextLine();
			e2.interrupt();
			e3.interrupt();
			System.out.println("\n*** Arret deux dernieres threads ***");
	
		}
	}
	
	
}

class Ecrit2 extends Thread {
	public Ecrit2(String texte, long attente) {
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