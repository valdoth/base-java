
public class Tableaux {

	public static void main(String[] args) {
		
		String [] tab = {"java", "c", "pascal", "c++", "ada", "basic", "fortran", "python"};
		int nbCh = tab.length;
		String temp;
		
		System.out.print("tableau original : ");
		for (int i=0; i<nbCh; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		
		for (int i=0; i<nbCh-1; i++) {
			for (int j=i; j<nbCh; j++) {
				if (tab[i].compareTo(tab[j]) > 0) {
					temp = tab[i];
					tab[i] = tab[j];
					tab[j] = temp;
				}
			}
		}
		System.out.print("chaines triees : ");
		for (int i=0; i<nbCh; i++) {
			System.out.print(tab[i] + " ");
		}
		
	}

}
