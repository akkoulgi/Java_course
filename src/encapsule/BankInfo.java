package encapsule;

public class BankInfo {
	
	// I want to store my sensitive information in this class.
	
	private String bankname;
	private String accountnumber;
	private String IFSCcode;
	private long atmpin;
	private String branch;
	private String debitcard;
	
	
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getIFSCcode() {
		return IFSCcode;
	}
	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}
	public long getAtmpin() {
		return atmpin;
	}
	public void setAtmpin(long atmpin) {
		this.atmpin = atmpin;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDebitcard() {
		return debitcard;
	}
	public void setDebitcard(String debitcard) {
		this.debitcard = debitcard;
	}
	
	
	// To provide Write only  access - by creating setter for each variable
	
	
	
	
	
	
	

}
