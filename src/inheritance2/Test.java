package inheritance2;

public class Test {

	public static void main(String[] args) {

		TataMotors tm = new TataMotors();
		
		// Through the object of child class i will access my parent members
		
		tm.financeprocess();
		tm.hiringprocess();
		TataMotors.engineering();
		
		
		System.out.println(tm.budget);// these 2 are my parent class variables
		System.out.println(tm.founder);
		System.out.println(tm.CEO); // this is my child class variable
		
		
		
	}

}
