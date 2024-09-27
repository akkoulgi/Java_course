package overloading;

public class Demo2 {
	
	//In the below example - we are achieving method overloading
	// using variation in order of occurence.
	
	public static void display(int a1, String n) {
		
		System.out.println("Displaying the message"+a1+n);
	}
	
	/*
	 * public static void display(int a2, String n) {
	 * 
	 * System.out.println("Displaying the message"+a2+n); }
	 */

	
	
	public static void display(String name,int a) {
		
		System.out.println("Displaying the message"+name+a);
	}

	public static void display(boolean b,char c) {
		
		System.out.println("Displaying the message"+b+c);
	}
	public static void display(char c, boolean b) {
		
		System.out.println("Displaying the message"+c+b);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display(true,'P');
		display('O',false);
		display("Hi there",100);
		display(10,"My name is Don");


	}

}
