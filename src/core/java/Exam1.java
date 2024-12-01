package core.java;

import java.util.HashMap;

public class Exam1 {
	public static void main(String[] args) {
		String str = "sams";
		System.out.println(findFirtsNonRepeatedChar(str));

	}

	private static char findFirtsNonRepeatedChar(String str) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			hashMap.put(charAt, hashMap.getOrDefault(charAt, 0) + 1);
		}

		for (int i = 0; i < str.length(); i++) {
			if (hashMap.get(str.charAt(i)) == 1) {
				return str.charAt(i);
			}
		}
		return ' ';
	}
}
