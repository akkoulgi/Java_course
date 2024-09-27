package basics;

public class Practice1 {
	
	// Global variables - which are declared inside the class and outside the methods.
	// applicable to all the methods inside the class
	
	static int size =10;
	
	static String name= "Rahul";
	
	
	public static void main(String[] args) {
		
		// Local variables - are local to only those methods
		
		int num = 20 ;
		
		System.out.println(num); // local
	
		
		System.out.println(size); // global
		
		System.out.println(name);
		
		
	}
	
	
	public void display() {
		
		//System.out.println(num);
		
		System.out.println(size);
		System.out.println(name);
		
	}
	

}
