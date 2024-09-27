package constructors_demo;

public class Digital {

 
	// these are my variables that i want to initialise using constructor.
	int num;
	String name;
	
	
	// Parameterized constructor
	Digital(int n,String naam){
		
		num = n; // i initialised my global variables to n and naam 
		name=naam;
		
	}
	
	// Default constructor
	Digital(){
		
		
		
	}
	

	public static void main(String[] args) {

		//I will create an object of class
		
		Digital d = new Digital(100,"pooja");
		
		Digital d2 = new Digital(25, "pavitra");
		
		Digital d3 =  new Digital();
		
		
		System.out.println("Default constructor : ");
		
		System.out.println(d3.name);
		
		System.out.println(d3.num);
		
		// When we try to print with default constructor it will print default values of a variable.
		
		
		// For each object, i will be having different sets of data .
		// and through different objects i can access different data.
		
		System.out.println("Details of d object");
		System.out.println(d.name);
		System.out.println(d.num);
		
		
		System.out.println("Details of d2 object");
		System.out.println(d2.name);
		System.out.println(d2.num);
		
		
		// Objects will be having different state.
	}

}
