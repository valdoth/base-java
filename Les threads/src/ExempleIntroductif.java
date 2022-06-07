
public class ExempleIntroductif {

	public static void main(String[] args) {
		Ecrit e1 = new Ecrit("bonjour1 ", 10, 5);
		Ecrit e2 = new Ecrit("bonjour2 ", 12, 10);
		Ecrit e3 = new Ecrit("\n", 5, 15);
		e1.start();
		e2.start();
		e3.start();
	}

}


class Ecrit extends Thread {
	public Ecrit (String texte, int nb, long attente) {
		this.texte = texte;
		this.nb = nb;
		this.attente = attente;
	}
	
	public void run() {
		try {
			for (int i=0; i<nb; i++) {
				System.out.print(texte);
				sleep(attente);
			}
		} catch(InterruptedException e) {
			
		}
	}
	
	private String texte;
	private int nb;
	private long attente;
}
