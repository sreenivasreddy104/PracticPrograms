package core.java;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, -4, 5, -6, 7, -8, 2 };
		int target = 9;
		SubarrayWithGivenSum subarrayWithGivenSum = new SubarrayWithGivenSum();
		System.out.println(subarrayWithGivenSum.findSubArrayWithGivenSum(arr, target));
	}

	boolean findSubArrayWithGivenSum(int[] arr, int target) {

		int currentSum = 0;
		int finalSum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];

			if (currentSum < 0) {
				currentSum = 0;
			}

			if (currentSum > finalSum) {
				finalSum = currentSum;
			}

			if (target == finalSum) {
				return true;
			}
		}
		return false;
	}
}
