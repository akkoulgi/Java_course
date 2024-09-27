package Hierarchial;

public class Test {
	
	// Implementation of Hierarchiral Inheritance

	public static void main(String[] args) {

		Nutrichoice n = new Nutrichoice();
		
		
		// Nutrichoice class can access Parent Parle class methods
		n.makingprocess();
		Nutrichoice.employeeprocess();
		n.ingredients();
		
		
		// Bourbon class can access Parent Parle class methods

		Bourbon bn = new Bourbon();		
		bn.makingprocess();
		Bourbon.employeeprocess();
		
		bn.boubonrecipe();
		
		
	}

}
