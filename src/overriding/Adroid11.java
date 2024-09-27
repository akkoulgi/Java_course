package overriding;

public class Adroid11 extends Android{

	// I want to override my android class methods
	
	
	public void performance() {
		
		System.out.println("New Implementation in ANdoid 11 - 2024- Enhanced performacne");
		
	}
	
	public void userinterface() {
		
		System.out.println("New Implementation in ANdoid 11 -Enhanced UI 2024");

		
	}
	
	
	public void generalapps() {
		
		System.out.println("New Implementation in ANdoid 11 -Enhanced general apps 2024");

		
	}
	
	public void playstore() {
		
		System.out.println("New Implementation in ANdoid 11 -Enhanced playstore 2024");

		
	}

	
	
	
	public static void main(String[] args) {
		
		
		// Method overriding using child class object
		Adroid11 an = new Adroid11();
		
		an.performance(); // the decision to run the method from Child class is done at the Run time
		// hence Method Overriding is called as Run time Polymorphism.
		
		an.userinterface();
		
		an.generalapps();
		
		an.playstore();
		
		
		
		// calling methods from parent class(Not Method Overriding)
		Android a = new Android();
		
		a.generalapps();
		
		a.performance();
		
		a.playstore();
		
		a.userinterface();
		
		
		

	}

}
