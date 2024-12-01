package core.java;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, -4, 5, -6, 7, -8, 2 };

		int maxSum = kadaneAlgorithm(arr);

		System.out.println("The maximum subarray sum is: " + maxSum);
	}

	public static int kadaneAlgorithm(int[] arr) {
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];

			if (currentSum < 0) {
				currentSum = 0;
			}

			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
		}

		return maxSum;
	}
}
