package core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class StringAnagrams {
	public static void main(String[] args) {
		String[] str = {"eat", "tea", "ate", "nat", "tan", "bat"};
		List<List<String>> findStringAnagrams = findStringAnagrams(str);
		for (List<String> list : findStringAnagrams) {
			Collections.sort(list);
			System.out.println(list);
		}
	}
	
	private static List<List<String>> findStringAnagrams(String[] str) {
		HashMap<String,List<String>> hashMap = new HashMap<String, List<String>>();
		for (int i = 0; i < str.length; i++) {
			char[] charArray = str[i].toCharArray();
			Arrays.sort(charArray);
			String sortedString = new String(charArray);
			hashMap.putIfAbsent(sortedString, new ArrayList<String>());
			hashMap.get(sortedString).add(str[i]);
		}
		
		List<List<String>> arrayList = new ArrayList<>(hashMap.values());
		arrayList.sort((a, b) -> a.get(0).compareTo(b.get(0)));
		return arrayList;
	}
}
