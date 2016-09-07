package zadaci_07_09_2016;

import java.util.Scanner;

public class ReverseStringPrint {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// takes string
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		reverseDisplay(str);
		input.close();
	}

	// print it reversely
	private static void reverseDisplay(String str) {
		if (str.length() == 0)
			return;
		// prints last character
		System.out.print(str.substring(str.length() - 1));
		// send rest of the string to method
		reverseDisplay(str.substring(0, str.length() - 1));
	}
}