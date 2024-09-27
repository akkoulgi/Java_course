package overloading;

public class Demo {
	
	// Method overloading - with variation in Datatype of my arguement list
	
	// Arguement list - Whatever parameter that we provide 
	
	public static void display(int n) {
		
		System.out.println("Displaying the message"+n);
	}
	

	public static void display(String name) {
		
		System.out.println("Displaying the message"+name);
	}

	public static void display(boolean b) {
		
		System.out.println("Displaying the message"+b);
	}
	public static void display(char c) {
		
		System.out.println("Displaying the message"+c);
	}
	
	// In Method overloading, while calling the method in main.
	// based on the input we give, that particular method with the respective
	// datatype method will be executed

	public static void main(String[] args) {
		
		display('O');
		display("Hi There!!");
		display(false);
		display(100);

		
		
	}

}
