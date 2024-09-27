package basics;

// we cannot write anything outside the class in java except ur import statements


public class variables {
	
	
	static char status; // global , we can declare global variables as static
	static int value ;// global
	
	
	static boolean m ;	
	
	public static void main(String[] args) {
		
		// what is scope?
		
		int ani = 0 ; // static is an invalid modifier for local variables
		
			m =true;
		//System.out.println(ani);
		
		int copy = ani+2;
		
			System.out.println(status); // global variables will have some default values
										// default value of char is whitespace
			
			System.out.println(value); // default value of int is 0
			
			System.out.println(m);  //Default value of boolean is false
	
		
	}
	
	float f = 9.9f;// global
	
	
	public  void display(){
		
		String s = "Friday";
		
		
	}
	String name = "pavan";// global
	
} // this is end of class
