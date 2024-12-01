package core.java;

import java.util.Scanner;

public class FindNumberOfDigits {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int nextInt = scanner.nextInt();
		int count = 0;
		
		while(nextInt > 0) {
			nextInt = nextInt / 10;
			count ++;
		}
		System.out.println("Number of Digits: " + count);
	}
}
