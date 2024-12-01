package core.java;

public class RemoveSpecialCharFromString {

	public static void main(String[] args) {
		String str = "@#$%^*^Hi^^&** &^%&^%Sreen%^&i";
		String string = str.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(string);
	}

}
