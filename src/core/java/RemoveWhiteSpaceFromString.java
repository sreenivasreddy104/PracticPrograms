package core.java;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		String str  = "SreenivasReddy Bandi And Java Developer";
		String newStr = str.replaceAll(" ", "");
		System.out.println(newStr);

	}

}
