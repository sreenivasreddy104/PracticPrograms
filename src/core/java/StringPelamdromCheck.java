package core.java;

public class StringPelamdromCheck {
	
	private static boolean isStringPalendrom(String str) {
		String string = str.toLowerCase().replaceAll("[^a-z0-9]", "");
		String stringBuffer = new StringBuffer(string).reverse().toString();
		return string.equals(stringBuffer);
	}
	public static void main(String[] args) {
        String str = "A man, a plan, a canal, Panama";
        boolean stringPalendrom = isStringPalendrom(str);
        System.out.println("gjiven: " + str + "is Palendrome: " + stringPalendrom);
	}
}
