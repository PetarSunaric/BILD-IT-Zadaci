package zadaci_07_09_2016;

import java.util.Scanner;

public class SumDigitsInInteger {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// takes number
		System.out.print("Enter an integer: ");
		long n = input.nextLong();
		System.out.println(sumDigits(n));
		input.close();

	}

	// return sum of digits
	public static int sumDigits(long n) {

		if (n == 0)
			return (int) n;

		return (int) n % 10 + (int) (sumDigits(n / 10));
	}
}