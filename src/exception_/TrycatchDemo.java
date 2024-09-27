package exception_;

public class TrycatchDemo {

	public static void main(String[] args) {

		
		// Arithematic Exception 
		int a = 10;
		
		try {
		System.out.println(a/0); // this is where exception will occur
		
		}
		
		catch(ArithmeticException e) {
			
			//e.printStackTrace(); // this will print me the stack trace.
			
			
		}
		
		System.out.println("Line of code after expection is occuring");
		
		
		
		
	}

}
