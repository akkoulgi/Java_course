package exception_;

public class ThrowsDemo {

	public static void main(String[] args) throws InterruptedException {

		
		System.out.println("Before pause");
		Thread.sleep(2000); // This statement will pause your execution for 2 seconds
		System.out.println("After pause");
		
	}

}
