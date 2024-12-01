package core.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

public class FindMaxOccurcencesCharInString {

	public static void main(String[] args) {
		String str = "aaaabbchhhhhdss";

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
		}

		int max = 0;
		System.out.println(hashMap);

		Collection<Integer> values = hashMap.values();
		for (Integer integer : values) {
			if (integer > max) {
				max = integer;
			}
		}

		for (Entry<Character, Integer> integer : hashMap.entrySet()) {
			if (integer.getValue() == max) {
				System.out.println(integer.getKey() + " most occurence and value is " + max);
			}
		}
	}
}
