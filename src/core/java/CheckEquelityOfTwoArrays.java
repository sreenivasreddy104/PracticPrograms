package core.java;

public class CheckEquelityOfTwoArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 7 };
		int[] b = { 1, 2, 3, 4, 5, 6 };

		boolean status = true;

		if (a.length == b.length) {
			for (int i = 0; i < b.length; i++) {
				if (a[i] == b[i]) {
					status = true;
				} else {
					status = false;
				}
			}
		} else {
			System.out.println("both were not equel.");
		}

		System.out.println(status);

	}

}
