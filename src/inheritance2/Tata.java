package inheritance2;

public class Tata {
	
	String founder = "JRD tata";
	
	int budget = 20000;
	
	static String headquaters = "Pune";
	
	public void hiringprocess() {
		
		System.out.println("Hiring process is done with 2 tech rounds and one HR round and finally by :"+founder);
	}
	
	
	public void financeprocess() {
		
		System.out.println("Budget for 1 team per month is : "+budget);
		
	}
	
	public static  void engineering() {
		
		System.out.println("Engineering team infra located in "+headquaters);
		
	}

}
