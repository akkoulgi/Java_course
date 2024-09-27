package conditional;

public class NestedIf2 {

	public static void main(String[] args) {

		int num =1;
		
		
		if(num>10) {// true
			
		
			if(num==100) { // true
				
				System.out.println("Both the conditions are satisfied");
				
			} // end of inner if
			
			
		} // end of my outer if
		
		else
			System.out.println("number is less than 10");		
		
		
	}

}
