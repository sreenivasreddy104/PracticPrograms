package core.java;

public class PrimeNUmberOrNot {

	public static void main(String[] args) {
		int a = 5;
		int temp = 0;

		if (a > 1) {
			for (int i = 1; i <= a; i++) {
				if (a % i == 0) {
					System.out.println(a % 1);
					temp++;
				}
			}
			if (temp == 2) {
				System.out.println("Primenumber");
			} else {
				System.out.println("not a Prime Number...");
			}
		}

	}

}
