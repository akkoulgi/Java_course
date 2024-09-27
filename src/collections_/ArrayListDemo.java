package collections_;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Declaring an Arraylist
		
		ArrayList al = new ArrayList();
		
		
		// add values into arraylist.
		
		al.add(1);
		al.add(2);
		al.add(100);
		al.add(98);
		al.add(55);
		al.add(23);
		al.add(110);
		
		
		System.out.println(al); // insertion order is maintained
		
		
		/*
		 * al.add("java"); al.add(100); al.add('l'); al.add(true); al.add(0.03f);
		 * al.add(null);
		 */
		System.out.println(al.get(2)); // get is used to fetch the value.

		
		System.out.println(al);
		
		
		System.out.println(al.contains("selenium"));
		
		//al.clear(); // used to remove all the elements from array list
		
		System.out.println(al);
		
		
		 
		// addall()
		
		ArrayList al2 = new ArrayList(); 
		
		al2.add("selenium");
		al2.add(90);
		
		al2.addAll(al);
		
		
		System.out.println(al2); 
		
		
		al2.remove(2);
		al2.remove(true);
		
		System.out.println(al2); 

		al2.removeAll(al);
		
		
		System.out.println(al2); 

		
		
	}

}
