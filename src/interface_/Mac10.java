package interface_;

public class Mac10 implements Apple {
		
	

	public static void main(String[] args) {
		
		Mac10 mc = new Mac10();
		mc.ios();
		mc.logo();
		mc.processor();
		
		
	}

	@Override
	public void ios() {
		
		System.out.println("Ios oS is used here along with the latest features");
		
	}

	@Override
	public void logo() {
		
		System.out.println("Apple logo is used");
		
	}

	@Override
	public void processor() {
		
		System.out.println("Processor of default apple is used");
		
	}

}
