package listesChainees;

import java.util.LinkedList;
import java.util.ListIterator;

public class Liste1 {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		
		System.out.print("Liste en A : ");
		affiche(l);
		
		l.add("a");
		l.add("b");
		System.out.print("Liste en B : ");
		affiche(l);
		
		ListIterator<String> it = l.listIterator();
		it.next();	// on se place sur le premier element
		it.add("c");
		it.add("d");
		System.out.print("Liste en C : ");
		affiche(l);
		
		it = l.listIterator();	// on se replace en debut
		it.next();
		it.add("e");
		it.add("f");
		System.out.print("Liste en D : ");
		affiche(l);
	
		it = l.listIterator(l.size()); 	// on se replace en fin de liste
		while(it.hasPrevious()) {
			String ch = it.previous();
			if (ch.equals("b")) {
				it.remove();
				break;
			}
		}
		System.out.print("Liste en E : ");
		affiche(l);
		
		it = l.listIterator();
		it.next();
		it.next();	// on se positionne sur le deuxieme element
		it.set("x");
		System.out.print("Liste en F : ");
		affiche(l);
	
		System.out.println("notre liste avec la methode toString : " + l);
	}
	
	public static void affiche(LinkedList<String> l) {
		ListIterator<String> iter = l.listIterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
	}

}
