package basics;

public class MethodwithReturnType {

	public static void main(String[] args) {

		double res = subtraction(); // result variable is being returned to my main method
		
		System.out.println(res);
		
	}

	
	public static double subtraction() {
		
		
		int a= 10,b=9;
		
		
		double result = a-b;
		

		return result;
		
	}
	
	
}
