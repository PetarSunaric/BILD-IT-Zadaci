package zadaci_07_09_2016;

import java.util.Scanner;

public class OccurrencesOfSpecificCharacter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// takes string
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		// takes character
		System.out.print("Enter a character: ");
		char ch = input.next().charAt(0);
		System.out.println(count(str, ch));
		input.close();
	}

	// return number of occurrences
	public static int count(String s, char ch) {

		// checks if first letter is our character
		int n = (ch == s.charAt(0)) ? 1 : 0;
		if (s.length() == 1)
			return n;
		else
			return n + count(s.substring(1), ch);// send string without first
													// letter

	}

}
