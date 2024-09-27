package exception_;

public class Demo3 {

	public static void main(String[] args) {

		try {
		String course = "java";
				
		System.out.println(course.charAt(5));
		
		
		}
			
		catch(Throwable e) {
			
			
		}
		
		
		finally { // the code that we want to execute irrespective of whether 
			// the exception is happening or not
		
		System.out.println("Course attended");
		
		}
		

		
		
	}

}
