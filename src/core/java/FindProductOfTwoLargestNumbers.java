package core.java;

import java.util.Arrays;

public class FindProductOfTwoLargestNumbers {

	private static int findLargestProduct(int[] nums) {
		Arrays.sort(nums);
		int product1 = nums[nums.length-1]*nums[nums.length-2];
		int product2 = nums[0]*nums[1];
		return Math.max(product1, product2);
	}
	
	public static void main(String[] args) {
		int[] nums = {2, -1, 5, 6, -8};
		int findLargestProduct = findLargestProduct(nums);
		System.out.println(findLargestProduct);
	}
}
