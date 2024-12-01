package core.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("C:\\Users\\DELL\\Downloads\\textFile.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String readLine = bufferedReader.readLine();
		System.out.println(readLine);
	}
}
