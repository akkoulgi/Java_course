package inheritance;

public class State extends CentralGovernment{
	
	// I can access anything from my parent

	 protected String CM = "Siddaramaiah";
	
	
	public void statepolicies() {
		
		System.out.println("State policies");
	}
	
	
	public static void main(String[] args) {

		// By creating an object of child class , i can access my parent members as well.
		
		
		State s = new State(); // object of child access
		
		
		System.out.println("Accessing parent members using Inheritance i.e child class and object");
		s.aadhar();
		State.railways(); // Static method - Classname.Methodname()
		s.tax();
		
		System.out.println("Accessing parent variables from child object");
		//System.out.println(s.PM);		
		System.out.println(s.railwayMinister);
		
		
		System.out.println("CHild class members");
		
		System.out.println(s.CM);
		s.statepolicies();
		
	}

}
