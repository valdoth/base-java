package ensembles;

import java.util.HashSet;
import java.util.Iterator;

public class EnsOp {

	public static void main(String[] args) {
		
		int [] t1 = {2, 5, 6, 8, 9};
		int [] t2 = {3, 6, 7, 9};
		HashSet<Integer> e1 = new HashSet<>();
		HashSet<Integer> e2 = new HashSet<>();
		for (int v: t1) {
			e1.add(v);
		}
		for (int v: t2) {
			e2.add(v);
		}
		System.out.println("e1 = " + e1);
		System.out.println("e2 = " + e2);
		
		HashSet<Integer> ul = new HashSet<>();
		copie(ul, e1);
		ul.addAll(e2);
		System.out.println("ul = " + ul);
		
		HashSet<Integer> il = new HashSet<>();
		copie(il, e1);
		il.retainAll(e2);
		System.out.println("il = " + il);
	}

	public static <E> void copie(HashSet<E> but, HashSet<E> source) {
		Iterator<E> iter = source.iterator();
		while (iter.hasNext()) {
			but.add(iter.next());
		}
	}
	
}
