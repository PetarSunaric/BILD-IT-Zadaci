package zadaci_11_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KolikoGodinaIDana {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Unesite broj minuta: ");
		long minute = checkInput();
		// broj dana
		int dani = (int) minute / 60 / 24 % 365;
		// broj godina
		int godine = (int) minute / 60 / 24 / 365;
		System.out.println(minute + " minuta je " + godine + " godina i " + dani + " dana");

	}

	// provjerava upis
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
