package core.java;

import java.util.Scanner;

public class NumberIsPalendromOrNot {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter :");
		
		int nextInt = scanner.nextInt();
		int actual = nextInt;
		int rev = 0;
		while (nextInt != 0) {
			rev = rev * 10 + nextInt % 10;
			nextInt = nextInt / 10;
		}
		
		if (rev == actual) {
			System.out.println("Yes :" + actual + " is a palendrom");
		} else {
			System.out.println("No :" + nextInt + " is not a plendrom");
		}
	}
}
