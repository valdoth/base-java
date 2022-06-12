package vecteursDynamiques;

import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> v = new ArrayList<Integer>();
		System.out.println("En A : taille de v = " + v.size());
		
		for (int i=0; i<10; i++) {
			v.add(i);			
		}
		System.out.println("En B : taille de v = " + v.size() + " et v est " + v);
		
		System.out.print("contenu de v par acces direct (get) a chaque element = ");
		for (Integer integer : v) {
			System.out.print(integer + " ");
		}
		System.out.println();
		
		v.remove(3);
		v.remove(5);
		v.remove(5);
		System.out.println("en C : contenu de v apres suppression d'elements de position donnee : " + v);

		v.add(2, 100);
		v.add(2, 200);
		System.out.println("en D : contenu de v apres ajout d'elements = " + v);
		
		v.set(2, 1009);
		v.set(5, 2000);
		System.out.println("En E : contenu de v apres modification d'elements = " + v);
				
	}

}
