package abstraction_;

// Implementation class -class which is implementing the abstract method using overriding

// In Abstraction we do Method Overriding.

public class RotarySchool extends School {

	public void sports() {
		
		System.out.println("Volleyball, chess, cricket");
	}
	
	
	public void physicaltraining() {
		
		System.out.println("physycal training includes surya namaskar");
		
	}
	
	

	public static void main(String[] args) {

		 
		RotarySchool rs = new RotarySchool();
		
		
		rs.admin();
		
		rs.physicaltraining();
		
		rs.sports();
		
	}


}
