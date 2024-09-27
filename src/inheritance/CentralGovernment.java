package inheritance;

// This is my Parent class

public class CentralGovernment {
	
	
	protected String PM = "Narendra Modi";
	String railwayMinister = "Ashwini Vaishnav";
	
	
	
	protected void aadhar() {
		
		System.out.println("Aadhar card designed by Centre");
		
	}
	

	public static void tax() {
		
		System.out.println("Taxation laws are designed by central");
		
	}
	
	public static void railways() {
		
		System.out.println("Railways controlled by centre");
		
	}
	
	
	public static void main(String[] args) {
		
		CentralGovernment cd = new CentralGovernment();
		System.out.println(cd.PM);
		
	}
	
}
