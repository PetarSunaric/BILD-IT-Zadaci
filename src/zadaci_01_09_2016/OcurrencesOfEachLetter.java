package zadaci_01_09_2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OcurrencesOfEachLetter {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a File path: ");

		// takes a file
		String str = input.next();
		File file = new File(str);

		// read from it
		Scanner counting = new Scanner(file);
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] count = new int[alphabet.length()];// counts letters

		while (counting.hasNextLine()) {
			String content = counting.nextLine();// taking a line
			for (int i = 0; i < alphabet.length(); i++) {
				for (int j = 0; j < content.length(); j++) {
					// convert character to upper case if it is not
					char ch = Character.toUpperCase(content.charAt(j));
					if (ch == alphabet.charAt(i)) {// finds character from
													// alphabet
						count[i]++;// and increase its count
					}
				}
			}
		}
		// prints it
		for (int i = 0; i < alphabet.length(); i++) {
			if (count[i] != 0)
				System.out.println("Number of " + alphabet.charAt(i) + "'s: " + count[i]);
			System.out.println("Other letters wasn't in file.");
		}
		input.close();
		counting.close();
	}

}
