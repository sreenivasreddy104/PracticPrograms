package core.java;

import java.util.Scanner;

public class FindLargestNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A");
		int a = scanner.nextInt();
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter B");
		int b = scanner1.nextInt();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter C");
		int c = scanner2.nextInt();
		

		int lergest = a>b?a:b;
		int largestone = c>lergest ? c:lergest;
		
		System.out.println(largestone);
	}

}
