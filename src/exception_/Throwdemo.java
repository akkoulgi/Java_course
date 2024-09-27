package exception_;

public class Throwdemo {

	public static void main(String[] args) {

		String a =null;
		
		
		if(a.equals(null)) {
			
			throw new NullPointerException(); // throw keywrod is used to explicitly throw an exception
			// throw will not handle the exception, it will throw/ cause the exception
			
		} 
		else
			System.out.println("Normal flow of program");
			
		
		
	}

}
