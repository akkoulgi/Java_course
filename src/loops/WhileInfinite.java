package loops;

public class WhileInfinite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Logic here is condition should always be true
		
		int i =0;
		
		while(true) {
			
			if(i==1000)
			{
				break; // break keyword is used to break from a loop
				
			}
			
			System.out.println(i);
			i++;
		}
		
		// if the condition is always true , then while loop will run Infinitely
		
	}

}
