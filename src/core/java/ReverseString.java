package core.java;

public class ReverseString {

	public static void main(String[] args) {
		String original = "Hello, World!";
		String reversed = reverse(original);
		System.out.println("Reversed String: " + reversed);
	}

	public static String reverse(String str) {
		String reverse = "";
		for (int i = str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
}
