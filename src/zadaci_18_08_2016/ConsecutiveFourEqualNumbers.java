package zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsecutiveFourEqualNumbers {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter the number of values: ");
		int values = checkInput();

		// values becomes array length
		int[] niz = new int[values];

		System.out.println("Enter " + values + " values(must be greater than zero): ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = checkInput();
		}
		if (isConsecutiveFour(niz)) {
			System.out.println("The list has counsecutive four.");
		} else
			System.out.println("The list has no consecutive four.");

	}

	public static boolean isConsecutiveFour(int[] values) {

		// count same numbers
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			try {
				// if number is same as next one increase count
				if (values[i] == values[i + 1]) {
					count++;
					if (count == 3)
						return true;
				} else
					// if number is different reset count
					count = 0;
			} catch (ArrayIndexOutOfBoundsException ex) {
				continue;
			}
		}
		return false;
	}

	// checks input
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 1)
					throw new InputMismatchException();
				// if input is correct stops loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unesite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
