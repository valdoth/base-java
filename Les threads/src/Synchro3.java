import java.util.Scanner;

public class Synchro3 {

	public static void main(String[] args) {
		
		Reserve r = new Reserve();
		ThrAjout ta1 = new ThrAjout(r, 100, 15);
		ThrAjout ta2 = new ThrAjout(r, 50, 20);
		ThrPuise tp = new ThrPuise(r, 300, 10);
		System.out.println("Suivi de stock --- faire entree pour arreter");
		ta1.start();
		ta2.start();
		tp.start();
		try(Scanner sc = new Scanner(System.in)) {
			sc.nextLine();
		}
		ta1.interrupt();
		ta2.interrupt();
		tp.interrupt();
		
	}

}


class Reserve extends Thread {
	public synchronized void puise(int v) throws InterruptedException {
		if (v <= stock) {
			System.out.print("-- on puise " + v);
			stock -= v;
			System.out.println(" et il reste " + stock);
		} else {
			System.out.println("** stock de " + stock + " insuffisant pour puiser " + v + " **");
			wait();
		}
	}
	
	public synchronized void ajoute(int v) {
		stock += v;
		System.out.println("++ on ajoute  " + v + " et il y a maintenant " + stock);
		notifyAll();
	}
	
	private int stock = 500;
}

class ThrAjout extends Thread {
	public ThrAjout(Reserve r, int vol, int delai) {
		this.vol = vol;
		this.r = r;
		this.delai = delai;
	}
	
	public void run() {
		try {
			while(!interrupted()) {
				r.ajoute(vol);
				sleep(delai);
			}
		} catch(InterruptedException e) {
			
		}
	}
	
	private int vol;
	private Reserve r;
	private int delai;
}

class ThrPuise extends Thread {
	public ThrPuise(Reserve r, int vol, int delai) {
		this.vol = vol;
		this.r = r;
		this.delai = delai;
	}
	
	public void run() {
		try {
			while (!interrupted()) {
				r.puise(vol);
				sleep(delai);
			}
		} catch(InterruptedException e) {
			
		}
	}
	
	private int vol;
	private Reserve r;
	private int delai;
}