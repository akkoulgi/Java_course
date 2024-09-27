package Casting;

public class TypeCastingDemo {

	public static void main(String[] args) {

		//Widening - Primitive type casting.
		
		// Converting from short to int.
		
		short s = 5;
		
		int a =s;
		float f = s;
		double d = s;
		
		System.out.println(a);
		System.out.println(f);
		System.out.println(d);
		
		
		// Narrowing - Explicit Typecasting.
		
		
		double d1 = 1.43;
		
		float f1 = (float)d1;
		
		System.out.println(f1);
		
		
		long l = (long)d1;
		
		System.out.println(l);
		
		
		int i = (int)d1;
		
		System.out.println(i);
		
		
	}

}
