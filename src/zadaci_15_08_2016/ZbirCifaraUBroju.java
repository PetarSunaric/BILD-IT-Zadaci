package zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZbirCifaraUBroju {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// unos broja i ispis sume
		System.out.println("Unesite broj: ");
		long broj = checkInput();
		System.out.println("Suma cifara je: " + sumDigits(broj));

	}

	// racuna sumu broja
	public static int sumDigits(long n) {
		int sum = 0;
		// dok ima cifri
		while (n % 10 != 0) {
			// suma postaje suma + zadnja cifra
			sum += n % 10;
			// broj postaje broj bez zadnje cifre
			n /= 10;
		}
		return sum;
	}

	// provjerava unos
	public static long checkInput() {

		long num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextLong();
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
