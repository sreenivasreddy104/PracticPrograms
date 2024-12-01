package core.java;

import java.util.Scanner;

public class FindEvenAndOddNumbersCount {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int nextInt = scanner.nextInt();

		int evenNum = 0;
		int oddNum = 0;

		while (nextInt > 0) {
			int tem = nextInt % 10;
			if (tem % 2 == 0) {
				evenNum++;
			} else {
				oddNum++;
			}
			nextInt = nextInt / 10;
		}
		
		System.out.println("EvenNumber : "+ evenNum + "And " + "Odd Number: " + oddNum);
	}

}
