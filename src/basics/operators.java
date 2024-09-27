package basics;

public class operators {
	
	static int  num=10;// static variable
	
	int num1 =100; // non static variable

	public static void main(String[] args) {

		
		int i=0;
		
		System.out.println(++i); 
		
		System.out.println(i);
		
		int j = 10;
		
		System.out.println(j--); // print 10 , it will decrement the value , j  =9 
		
		System.out.println(j);
		
		System.out.println(--j); // first it will decrement , j =8 , it will print 8 
		
		System.out.println(j);
		
	}
	
	// In java, if we  want to declare non static, we dont have to use any keyword such as static.
	//if we want to create a static member,then we  have to use the keyword static.
	

	public void display() { // this method is non static
		
		
		
	}
	
	
}
