package core.java;

import java.util.HashMap;

public class FindFirestNonReapeatedChar {

	private static char findFirstNonReapeatedChar(String str) {
		HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c1 = str.charAt(i);
			hashMap.put(c1, hashMap.getOrDefault(c1, 0) + 1);
		}

		for (int i = 0; i < str.length(); i++) {
			char c2 = str.charAt(i);
			if (hashMap.get(c2) == 1) {
//				return c2;
			}
		}
		return '\0';
	}

	public static void main(String[] args) {
		String str = "sawiss";
		char firstNonReapeatedChar = findFirstNonReapeatedChar(str);
		System.out.println(firstNonReapeatedChar);
	}
}
