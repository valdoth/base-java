import java.util.Scanner;

public class Synchro4 {

	public static void main(String[] args) {
		
		Nombres1 nomb = new Nombres1();
		Thread calc = new ThrCalc1(nomb);
		Thread aff = new ThrAff1(nomb);
		System.out.println("Suite de carres - tapez retour pour arreter");
		calc.start();
		aff.start();
		try (Scanner sc = new Scanner(System.in)) {
			sc.nextLine();
		}
		calc.interrupt();
		aff.interrupt();
	}
	
}


class Nombres1 {
	public synchronized void calcul() throws InterruptedException {
		if (!pret) {
			n++;
			carre = n*n;
			pret = true;
			notifyAll();
		} else {
			wait();
		}
	}
	
	public synchronized void affiche() {
		try {
			if (pret) {
				System.out.println(n + " a pour carre " + carre);
				notifyAll();
				pret = false;
			} else {
				wait();
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	public boolean pret() {
		return pret;
	}
	
	private int n = 0;
	private int carre;
	private boolean pret = false;
}

class ThrCalc1 extends Thread {
	public ThrCalc1(Nombres1 nomb) {
		this.nomb = nomb;
	}
	
	public void run() {
		try {
			while(!interrupted()) {
				this.nomb.calcul();
				sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	private Nombres1 nomb;
}

class ThrAff1 extends Thread {
	public ThrAff1(Nombres1 nomb) {
		this.nomb = nomb;
	}
	
	public void run() {
		try {
			while(!interrupted()) {
				this.nomb.affiche();
				sleep(75);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	private Nombres1 nomb;
}