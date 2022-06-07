
public class TestInterfaceRunnable {

	public static void main(String[] args) {
		Ecrit1 e1 = new Ecrit1("bonjour ", 10 , 5);
		Ecrit1 e2 = new Ecrit1("bonsoir ", 12, 10);
		Ecrit1 e3 = new Ecrit1("\n", 5, 15);
		
		Thread t1 = new Thread(e1);
		t1.start();
		Thread t2 = new Thread(e2);
		t2.start();
		Thread t3 = new Thread(e3);
		t3.start();
	}

}

class Ecrit1 implements Runnable {

	public Ecrit1(String texte, int nb, long attente) {
		this.texte = texte;
		this.nb = nb;
		this.attente = attente;
	}
	
	public void run() {
		try {
			for (int i=0; i<nb; i++) {
				System.out.print(texte);
				Thread.sleep(attente);
			}
		} catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	
	private String texte;
	private int nb;
	private long attente;
	
}