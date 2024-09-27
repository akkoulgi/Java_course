package Stringdemo;

public class StringMethods {

	public static void main(String[] args) {
		
		String sentence = "I am a human being"; // declaring using normal string literal
		
		String s = new String("I am a robot"); // decalare and initialize a string using new keyword i.e by creating object of string.
		
		String s2 = "         I am a Robot            ";
		
		
		System.out.println(sentence);
		
		System.out.println(s);
		
		
		System.out.println(s.charAt(6)); // charat method
		
		System.out.println(s.contains("robot"));
		
		System.out.println(s.concat("and I will not harm any humans"));
			
		System.out.println(s); // Strings are immutable - the original value will not be changed/ modified.
		
		System.out.println(s.endsWith("robot"));
		
		System.out.println(s.equals(s2));
		
		System.out.println(s.equalsIgnoreCase(s2));
		
		
		System.out.println(s2.trim()); // trims the white spaces at the start and end of string.
		
		String[] result = s.split(" ");
		
		for (int i = 0; i < result.length; i++) {
			
			System.out.println(result[i]);
			
		}
		
		
		String joke = "once  upon  a time there was an ant"; // using split i am splitting one string into many
		
		String[] resjoke = joke.split("  ");
		
		
		for (int i = 0; i < resjoke.length; i++) {
			
			System.out.println(resjoke[i]);
			
		}
		
		
		
	}

}
