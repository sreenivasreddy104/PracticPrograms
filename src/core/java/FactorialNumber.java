package core.java;

import java.util.Scanner;

public class FactorialNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Numbers: ");
		int enteredValue = scanner.nextInt();

		int factorial = 1;
		for (int i = 1; i <= enteredValue; i++) {
			factorial = factorial * i;
		}
		
		System.out.println(factorial);
	}

}
