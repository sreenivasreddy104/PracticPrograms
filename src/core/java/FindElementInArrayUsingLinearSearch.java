package core.java;

public class FindElementInArrayUsingLinearSearch {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 4, 50, 60, 6 };
		int searchElement = 60;
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] == searchElement) {
				System.out.println("Search Element found :" + searchElement);
				break;
			}
		}
	}
}
