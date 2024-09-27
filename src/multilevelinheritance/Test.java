package multilevelinheritance;

public class Test {
	
	// Implementing MultiLevel Inheritance.

	public static void main(String[] args) {

		GrandChild gc = new GrandChild();
		
		System.out.println(gc.anilwealth); // Parent variable
		
		System.out.println(gc.wealth); // grandparent variable
		
		
		gc.privatebusiness(); // Parent method
		
		//gc.farmbusiness();
		
		
		GrandChild.farmbusiness(); // static way , GrandParent method
		
		gc.job(); // Grandparent method 
		
		
		
	}

}
