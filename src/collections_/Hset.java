package collections_;

import java.util.ArrayList;
import java.util.HashSet;

public class Hset {

	public static void main(String[] args) {
	
		ArrayList ar = new ArrayList();
		
		
		ar.add(1);
		ar.add(1);
		ar.add("Batman");
		ar.add("Batman");
		ar.add("joker");
		ar.add(null);
		ar.add(9000);
		
		System.out.println(ar);		
		
		HashSet h = new HashSet();
		
		h.add(1);
		h.add("joker");
		
		h.add(false);
		
		h.add('2');
		
		h.add(9000);
		
		h.add(9000);
		h.add(false);
		h.add('2');
		h.add("joker"); // we cannot store Duplicate values inside Set Interface.
		
		
		System.out.println(h); // Insertion order is not maintained.
		
		
		h.remove(false);
		
		h.remove('2');
		
		h.add(null); // we can add one null value inside hashset.
		
		System.out.println(h);
		
		h.addAll(ar); // Adding arraylist to the hashset.
		
		
		System.out.println(h); // Hashset removes the duplicate elements from the arraylist added.
		
	
		
		
	}

}
