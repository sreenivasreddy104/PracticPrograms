package core.java;

public class FindNumberOfWordsInString {
	public static void main(String[] args) {
		String str = "Hello World And";
		int count = 1;
		
		int length = str.split(" ").length;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ')) {
				count++;
			}
		}
		System.out.println(length);
	}
}
