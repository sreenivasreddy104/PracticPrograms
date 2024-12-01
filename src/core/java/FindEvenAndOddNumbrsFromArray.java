package core.java;

import java.util.ArrayList;
import java.util.Arrays;

public class FindEvenAndOddNumbrsFromArray {

	public static void main(String[] args) {
		int[] ar = { 2, 3, 4, 5, 6, 7, 8, 9 };

		ArrayList<Integer> evenNum = new ArrayList<Integer>();
		ArrayList<Integer> oddNum = new ArrayList<Integer>();

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				evenNum.add(ar[i]);
			} else {
				oddNum.add(ar[i]);
			}
		}

		int[] evenNumber = new int[evenNum.size()];
		int[] oddNumbes = new int[oddNum.size()];

		for (int i = 0; i < evenNum.size(); i++) {
			evenNumber[i] = evenNum.get(i);
		}

		for (int i = 0; i < oddNum.size(); i++) {
			oddNumbes[i] = oddNum.get(i);
		}
		System.out.println("EvenNumbers : " + Arrays.toString(evenNumber) + "Odd Numbers : " + Arrays.toString(oddNumbes));
	}
}
