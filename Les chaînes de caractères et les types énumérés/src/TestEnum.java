
enum Jour {
	lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche;
	
	public void affiche() {
		System.out.println(this.toString());
	}
}

public class TestEnum {

	public static void main(String[] args) {
		
		Jour courant;
		courant = Jour.mardi;
		
		if (courant == Jour.dimanche) {
			System.out.println("On se repose");
		} else {
			System.out.println("On bosse");
		}
		
		if (courant.equals(Jour.samedi)) {
			System.out.println("debut du week-end");
		} else {
			System.out.println("jour ouvrable de la semaine");
		}
		
		if (courant.ordinal() < 5) {
			System.out.println("on est encore en semaine");
		}
		
		System.out.println("rand du jour dans la semaine (lundi=1) : " + (courant.ordinal()+1));
		System.out.println(courant);
		System.out.println("----------------------------");
		
		for (Jour j: Jour.values()) {
			j.affiche();
		}
		
		
	}

}
