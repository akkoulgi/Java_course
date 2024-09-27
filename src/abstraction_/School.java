package abstraction_;

//abstract method are always non static in nature.
// we cannot create a static abstract method.
// we cannot add a final keyword to abstract method.
// abstract method should always be public/ protected.
// whenever we create an abstract method , we have to override 


public abstract class School { // abstract class
	
	public void admin() { // concrete method
		
		System.out.println("Admininstration is run by a board of 5 members");
		
	}
	


	public abstract void sports(); // abstract method
	
	
	
	public abstract void physicaltraining();

}
