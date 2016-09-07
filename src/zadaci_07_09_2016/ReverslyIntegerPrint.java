package zadaci_07_09_2016;

import java.util.Scanner;

public class ReverslyIntegerPrint {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// takes a number
		System.out.print("Enter an integer: ");
		int value = input.nextInt();
		reverseDisplay(value);
		input.close();
	}

	// print number in reverse order
	public static void reverseDisplay(int value) {

		if (value <= 0)
			return;

		System.out.print(value % 10); // print last digit
		reverseDisplay(value / 10);
	}
}
