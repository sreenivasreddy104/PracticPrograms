package core.java;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 30, 60, 4, 9, 8 };

		System.out.println("Before Sort: " + Arrays.toString(ar));
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar.length - 1; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		System.out.println("After Sort: " + Arrays.toString(ar));
	}
}
