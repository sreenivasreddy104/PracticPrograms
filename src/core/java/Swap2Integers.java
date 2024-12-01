package core.java;

public class Swap2Integers {

	public static void main(String[] args) {
		int a = 55, b = 60;
		
		System.out.println("Before swap a: " + a + ",b: " + b);
		
		int t = a;
		a = b;
		b = t;
		
		System.out.println("After swap a: " + a + ",b: " + b);
		
	}

}
