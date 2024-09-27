package basics;

public class MethodWIthPara_Return {

	public static void main(String[] args) {

			int remainder = modulas(20,3);
			
			System.out.println(remainder);
		
	}
	
	
	public static int modulas(int a, int b) {
		
		
		int result = a % b;
		
		return result;
		
	}

}
