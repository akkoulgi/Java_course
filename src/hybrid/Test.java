package hybrid;

public class Test {

	// Hybrid Inheritance
	
	public static void main(String[] args) {
			
		//multilevel 
		
		Grandson gs = new Grandson();
		
		gs.privatebusiness();// parent
		
		Grandson.farmbusiness();// grandparent
		
		
		// hierarchial
		
		Uncle un = new Uncle();
		
		Uncle.farmbusiness();
		
		un.job();
		
		//un.privatebusiness();
		
		
		
		
	}

}
