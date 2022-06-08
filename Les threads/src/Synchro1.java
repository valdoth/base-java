import java.util.Scanner;

public class Synchro1 {

	public static void main(String[] args) {
		
		Nombres nomb = new Nombres();
		Thread calc = new ThrCalc(nomb);
		Thread aff = new ThrAff(nomb);
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


class Nombres {
	public synchronized void calcul() {
		n++;
//		try {
//			Thread.sleep(200);
//		} catch(InterruptedException e) {
//			
//		}
		carre = n*n;
	}
	
	public synchronized void affiche() {
		System.out.println(n + " a pour carre " + carre);
	}
	
	private int n = 0;
	private int carre;
}

class ThrCalc extends Thread {
	public ThrCalc(Nombres nomb) {
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
	
	private Nombres nomb;
}

class ThrAff extends Thread {
	public ThrAff(Nombres nomb) {
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
	
	private Nombres nomb;
}