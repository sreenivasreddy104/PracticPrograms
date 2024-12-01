package core.java;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str = "Java Program";

		String[] words = str.split(" ");
		String reverseString = "";
		for (String word : words) {
			String reverseWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + word.charAt(i);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println(reverseString);
	}
}
