package conditional;

public class NesedIf {

	public static void main(String[] args) {

		
		// If condition inside an if condition is called as Nested if
		
		String name = "Sharath";
		
		String name2= "Sharath";
		
		String ch = "h";
		
				
		
		
		if(name.equals(name2)) { // equals method will compare both the strings, and return
			// true only if the strings are equal
			
			
			if(name.contains(ch)) { // Contains function will check whether h is present in name string or not
				
				System.out.println("String is Equal and ending with the h");
				
			}
			
			
		}
		
		
		
		
	}

}
