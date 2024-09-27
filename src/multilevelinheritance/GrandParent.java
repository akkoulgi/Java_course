package multilevelinheritance;

public class GrandParent {
	
	String name = "Vijay";
	
	int wealth = 1000000;
	
	static String hometown = "mysore";

	
	public void job() {
		
		System.out.println("Vijay had a government job");
	}
	
	
	public static void farmbusiness() {
		
		System.out.println("Farm located at"+hometown );
		
	}
	
	

}
