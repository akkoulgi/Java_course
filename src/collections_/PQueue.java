package collections_;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQueue {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();
		
		PriorityQueue pq2 = new PriorityQueue();
				
		
		pq.add(100);
		pq.add(99);
		pq.add(2);
		pq.add(1);
		pq.add(54);
		pq.add(36);
		
		
		//pq.add("pquee"); // If we try to add non comparable elements, then we will get ClassCastException.
		
		
		System.out.println(pq); // Insertion order is not maintained.
		
		pq.remove(99);
		
		System.out.println(pq);
		
		
		;
		System.out.println("peek method --> "+pq.peek());
		System.out.println(pq);

		
		System.out.println("Poll method --> "+pq.poll()); // first it will retrieve the head, after retreving it will
		// remove the head
		System.out.println(pq);
		
		
		pq2.add(100);
		
		pq2.addAll(pq);
		
		System.out.println(pq2); // Duplicate values are allowed in Priority Queue.
		
		//pq2.add(null);
		
		System.out.println(pq2);// If we try to add Null values then we will get a NullPointer Exception.
		
		
		System.out.println("Iterator demo");
		Iterator pqit = pq.iterator();
		
		// we use iterator to iterate over collections.
		
		while(pqit.hasNext()) {
			
			System.out.println(pq.poll());
			
		}

		
		
		
		
		
	}

}
