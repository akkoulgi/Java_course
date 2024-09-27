package encapsule;

public class Test {

	public static void main(String[] args) {

		// From this class i will try to read and write my sensitive info securely using Encapsulation.
		
		
		BankInfo bi = new BankInfo();
		
		// using setters to enter the values of a user
		bi.setAccountnumber("109213124243");
		bi.setAtmpin(10902);
		bi.setBankname("Canara bank");
		bi.setBranch("RR nagar");
		bi.setDebitcard("109021309123");
		bi.setIFSCcode("CA234324IO");
		
		
		// Read the values.
		
		
		System.out.println(bi.getAccountnumber());
		System.out.println(bi.getAtmpin());
		System.out.println(bi.getBankname());
		System.out.println(bi.getBranch());
		System.out.println(bi.getDebitcard());
		System.out.println(bi.getIFSCcode());
		
		
		
		
		
		
		
		
	}

}
