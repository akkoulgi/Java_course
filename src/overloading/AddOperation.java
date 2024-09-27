package overloading;


// This program shows Method Overloading with Variation in the arguement list
public class AddOperation {

	
	// here length of arguement list is 2 

	public int add(int n1, int n2) {		
		return n1+n2;
		
	}
	
	// here length of arguement list is 3

	
	public int add(int n3, int n4, int n5) {
		
		return n3+n4+n5;
		
	}
	
	// here length of arguement list is 4

	public int add(int n6, int n7, int n8, int n9) {
		
		return n6+n7+n8+n9;
	}

	
	// here length of arguement list is 5

	

	public int add(int n,int n10, int n11,int n12, int n13) {
		
		return n+n10+n11+n12+n13;
		
		
	}
	
	//The method declaration getting binded to its definition at the compile time
	//by the compiler based on the arguments passed is called Compile time Polymorphism. 

	
	
	public static void main(String[] args) {

		AddOperation ao = new AddOperation();
		
		
		System.out.println(ao.add(1,2));
		System.out.println(ao.add(3, 1, 10));
		System.out.println(ao.add(4, 1, 55, 13));
		System.out.println(ao.add(0, 0, 0, 0, 0));

		
				
		
	}

}
