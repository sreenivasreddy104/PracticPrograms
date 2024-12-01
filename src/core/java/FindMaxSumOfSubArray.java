package core.java;

public class FindMaxSumOfSubArray {
	
	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, -4, 5, -6, 7, -8, 2 };

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length; j++) {
				System.out.print("Subarray from " + i + " to " + j + ": ");
				int sum = 0;
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
					sum += arr[k];
					if (sum > max) {
						max = sum;
					}
				}
				System.out.println("= " + sum); // Print sum of current subarray
			}
		}
		System.out.println("Max Sum : " + max);
	}
}
