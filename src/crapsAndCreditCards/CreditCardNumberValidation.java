package crapsAndCreditCards;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreditCardNumberValidation {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a credit card number as a long integer: ");
		long number = checkInput();
		// if number is valid or starts with one of the digits in column
		if (isValid(number) && (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
				|| prefixMatched(number, 6))) {
			System.out.println(number + " is valid");

		} else
			System.out.println(number + " is invalid");

	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		// if size is between 12 and 17
		if (getSize(number) > 12 && getSize(number) < 17) {
			// if step 2 + step 3 divisible by 10 return true;
			System.out.println(sumOfDoubleEvenPlace(number));
			System.out.println(sumOfOddPlace(number));
			if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {
				System.out.println(getSize(number));
				return true;
			}
		}
		return false;
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		while (number % 100 != 0) {
			// sum of digits on even places doubled
			sum += getDigit(2 * ((int) (number % 100 / 10)));
			// number becomes number without last 2 digits
			number /= 100;
		}
		return sum;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {
		if (number > 9) {
			return (number % 10) + (number / 10);
		}

		return number;

	}

	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		int sum = (int) (number % 10);
		number /= 10;
		while (number % 100 != 0) {
			// get first digit of last two
			int num = (int) (number % 100 / 10);
			number /= 100;
			sum += num;
		}
		return sum;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		// if prefix is same as number in argument
		if (getPrefix(number, getSize((long) d)) == d) {
			return true;
		}
		return false;
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {
		int count = 1;
		while (d / 10 != 0) {
			d /= 10;
			count++;
		}
		return count;
	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		if (getSize(number) >= k) {
			// number goes until argument that is prefix
			int broj = getSize(number) - k;
			for (int i = 0; i < broj; i++) {
				number /= 10;
			}
		}
		return number;
	}

	// checks input
	public static long checkInput() {

		long num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextLong();
				if (num < 0)
					throw new InputMismatchException("Negativan broj");
				// if input is correct stops loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unsite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}

}
