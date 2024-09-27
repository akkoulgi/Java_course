package constructors_demo;

public class Pepsi {
	
	
	String CEO;
	int emp_count;
	double price;
	boolean healthy;
	
	Pepsi(String CEO,int emp_count,double price,boolean healthy){
		
		this.CEO = CEO;
		this.emp_count=emp_count;
		this.price= price;
		this.healthy=healthy;
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		Pepsi p = new Pepsi("Ramon Laguarta", 1000, 15, false);
		
		// printing the initialized values
		
		System.out.println(p.CEO);
		System.out.println(p.emp_count);
		System.out.println(p.price);
		System.out.println(p.healthy);
		

	}

}
