package core.java;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		String[] stringAr = { "Java", "C", "C++", "Paython", "Java" };

		for (int i = 0; i < stringAr.length; i++) {
			for (int j = i + 1; j < stringAr.length; j++) {
				if (stringAr[i] == stringAr[j]) {
					System.out.println("Duplicate Element : " + stringAr[i]);
				}
			}
		}
	}

}
