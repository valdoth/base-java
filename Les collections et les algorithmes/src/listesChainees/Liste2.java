package listesChainees;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Liste2 {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		System.out.println("Donnez une suite de mots (vide pour finir)");
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				String ch = sc.nextLine();
				if (ch.length() == 0) {
					break;
				}
				l.add(ch);
			}
		}
		
		System.out.print("Liste des mots a l'endroit :");
		ListIterator<String> iter = l.listIterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.print("Liste des mots a l'envers : ");
		iter = l.listIterator(l.size());
		while (iter.hasPrevious()) {
			System.out.print(iter.previous() + " ");
		}
		System.out.println();
		
	}

}
