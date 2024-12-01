package core.java;

import java.util.Scanner;

public class FindSumOfDigites {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter :");
		int nextInt = scanner.nextInt();
		
		int sum = 0;
		while (nextInt > 0) {
			sum = sum + nextInt%10;
			nextInt = nextInt / 10;
		}
		
		System.out.println("Sum of all digites :" + sum);
	}

}
