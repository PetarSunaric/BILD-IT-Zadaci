package zadaci_30_08_2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountWordLinesCharacters {

	public static void main(String[] args) throws IOException {

		// import file
		Scanner input = new Scanner(new File("src/zadaci_30_08_2016/Help.txt"));

		int characters = 0, words = 0, lines = 0;
		while (input.hasNextLine()) { // while there is something in code
			String s = input.nextLine();
			lines++; // increase number of lines with every line taken
			characters += s.length();
			String[] split = s.split(" "); // splits line on array of words
			words += split.length;
		}

		System.out.println("Characters: " + characters);
		System.out.println("Words: " + words);
		System.out.println("Lines: " + lines);
		input.close();

	}

}
