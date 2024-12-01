package core.java;

public class FindEvenAndOddNumbersFromAnArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 5, 6, 4, 8, 9 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}

		System.out.println("FindEvenAndOddNumbersFromAnArray: " + sum);
	}
}
