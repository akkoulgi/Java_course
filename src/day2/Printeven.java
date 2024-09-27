package day2;

public class Printeven {
	
	// Print odd  numbers from 0 to 10

	public static void main(String[] args) {
		
		// If we use = , then we are assignong the value(assignment operator)
		
		// If we are using == , then it acts as comparision operator
		
		for(int i=0;i<=10;i++) {
			
			if(i%2==1) { // The remainder should be 1 if i divide i by 2
				
				System.out.println(i);
				
			}
			
			
		}
		
		
	}

}
