package Casting;

public class Test {

	public static void main(String[] args) {

		Nokia nk = new Samsung(); // syntax for Upcasting - converting child class object ot parent type.
		
		//nk.userinterface();
		//nk.display();
		// nk.os(); // When we have done upcasting, we cannot access the child class methods 
		
		//nk.os(); // when we override method , we will get child class implementation.
	// In Upcasting, if we do overriding, then we will get child class implementation and 
		// not parent implementation.
		
		
		Samsung s = (Samsung) nk; // downcasting syntax
		
		
		s.display(); // trying downcasting without upcasting will lead to ClassCastException
		s.os();// we are able to access both parent and child objects
		s.userinterface(); 
		
		// downcasting acts as a normalizing feature of Upcasting.
		// Downcasting without upcasting doesnt make sense.
		
	
	}

}
