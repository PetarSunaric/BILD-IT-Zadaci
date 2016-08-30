package zadaci_29_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissmatchException {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter first integer: ");
		int num1 = checkInput();
		System.out.print("Enter second integer: ");
		int num2 = checkInput();
		// displays sum
		System.out.println("Sum of those two are: " + (num1 + num2));

	}

	// checks input
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				// if input is correct stops loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Wrong input, try again:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
