package exception_;

public class OutofBounds {

	public static void main(String[] args) {

		try {
		String course = "java";
				
		System.out.println(course.charAt(5));
		
		
		}
			
		catch(StringIndexOutOfBoundsException e) {
			
			
		}
		
		catch(ArrayIndexOutOfBoundsException e1) {
			
			
			
		}
		
		finally { // the code that we want to execute irrespective of whether 
			// the exception is happening or not
		
		System.out.println("Course attended");
		
		}
		
		
	}

}
