package collections_;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		
		
		  // Insertion order is not maintained 
		//We cannot add more than one Null key. 
		// We can add multiple null values. 
		// hashmap can store Duplicate values, but not duplicate keys.
		
		
		HashMap<Integer, String> hp = new HashMap<>();
		
		HashMap<Boolean,Character > hp1 = new HashMap<>();
		
		hp1.put(true, null);
		hp1.put(false, 'A');
		
		System.out.println(hp1);

		
		
		hp.put(100, "RCB");
		hp.put(20, "MI");
		hp.put(11, "RR");
		hp.put(11, "KKR");// when we try to add duplicate key, value will be replaced
		
		hp.put(12, "KKR");
		
		hp.put(null, null); // it is unordered collection and also we can store NULL values in key value
		
		hp.put(1000, null);
		
		hp.put(null, "GT");
		
		
		
		System.out.println(hp);
		
		
		hp.remove(20);
		hp.remove(11,"KKR");
		
		System.out.println(hp);
		
		System.out.println(hp.get(null));// this will fetch the value of the key mentioned
		
		
		
		System.out.println(hp.containsKey(100));
	
		System.out.println(hp.containsValue(null));

		

	}

}
