package Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {

		// Arrays are non primitive in nature
		
		int num[] = new int[5]; // declaring and initializing using new keyword
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 90;
		num[3] = 89;
		num[4] = 100;
		
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println(num[i]);
			
			
		}
		
		
		num[3] =80; // change the value ofan element in array
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println(num[i]);
			
			
		}

		
		
		

		String divs[] = new String[3];
		
		
		divs[0]="accuracy";
		divs[1]= "strength";
		divs[2] = "focus";
		
		
		for (int i = 0; i < divs.length; i++) {
			
			System.out.println(divs[i]);
		}
		
		divs[2]="attribute";
		
		
	}

}
