package nonstatic;

public class Infosys {
	
	String CEO="Narayan Murthy";
	int emp_count=50000;
	
	
	public void hiringprocess() {
		
		System.out.println("Hiring process includes 4 technical rounds");
		
	}
	
	public void engineering() {
		
		System.out.println("Consists of DEvs, testers, PM, Architects");
	}
	
	
	public static void main(String[] args) {
		
		// Create an object of Infosys class.
		
		Infosys in = new Infosys(); 
		
		System.out.println("CEO of Infosys is "+in.CEO);
		
		System.out.println("EMployee count of company is "+in.emp_count);
		
		in.hiringprocess();
		
		in.engineering();
		
		
		
		
	}

}
