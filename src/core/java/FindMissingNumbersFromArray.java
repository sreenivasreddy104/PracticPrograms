package core.java;

import java.util.HashSet;

public class FindMissingNumbersFromArray {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 5, 7, 9 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
			
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println("min : " + min + " Max : " + max);

		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i : ar) {
			hashSet.add(i);
		}

		for (int i = min; i <= max; i++) {
			if (!hashSet.contains(i)) {
				System.out.println("missing Numbers : " + i);
			}
		}
	}

}
