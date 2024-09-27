package nonstatic;

import basics.operators;
import inheritance.CentralGovernment;
import inheritance.State;

//import basics.operators;

public class Test extends CentralGovernment {

	public static void main(String[] args) {
	

		Test t = new Test();
	
		t.aadhar();
		
		State s = new State();
		
		s.statepolicies();
		
		
		CentralGovernment.tax();
		
		
		System.out.println(t.PM); // through the child class object i wille be able to access protected members
		

		// step 1 - to acces non static create an object
		
		
		Oracle or = new Oracle(); 
		
		System.out.println("Non static members below ");
		
		or.products();
		
		System.out.println(or.address);
		
		System.out.println("static members below ");

		// accessing static members
		
		Oracle.accounts();
		
		System.out.println(Oracle.emp_count);
		
		
		// TO access the members of Infosys class(Non static only) we have to create object of Infosys class
		
		System.out.println("Infosys details below");
		
		Infosys i = new Infosys();
		
		i.engineering();
		
		i.hiringprocess();
		
		System.out.println(i.emp_count);
		
		System.out.println(i.CEO);
		
		
		operators op = new operators();
		
		
		
	}

}
