package core.java;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 9, 8, 4, 6, 10, 15 };
		Arrays.sort(array);

		int l = 0;
		int h = array.length;
		int searchElemt = 9;

		boolean flag = false;

		while (l <= h) {
			int m = (l + h) / 2;
			if (array[m] == searchElemt) {
				System.out.println("Element Found..");
				flag = true;
				break;
			}

			if (array[m] < searchElemt) {
				l = m + 1;
			}

			if (array[m] > searchElemt) {
				h = m - 1;
			}
		}

		if (!flag) {
			System.out.println("Element NOT Found..");
		}
	}

}
