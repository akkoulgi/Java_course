package conditional;

public class multipleIf {

	public static void main(String[] args) {

		int totalmarks = 35;
		
		
		if(totalmarks>35 && totalmarks<=85) { // Using Logical and to define the range
			
			System.out.println("Passed with First Class");
			
		}else
			if(totalmarks>85 && totalmarks <=110) {
				
				System.out.println("Passed with Distinction");
				
				
			}
			else if(totalmarks<=35)
			{
				System.out.println("Student is unfortunately failed");
				
			}
		
		
	}

}
