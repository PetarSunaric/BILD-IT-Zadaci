package zadaci_10_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BrojDanaUGodini {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite pocetnu godinu: ");
		int pocetnaGodina = checkInput();
		System.out.print("Unesite krajnju godinu: ");
		int krajnjaGodina = checkInput();
		// unesene godine su raspon petlje
		for (int i = pocetnaGodina; i <= krajnjaGodina; i++) {
			System.out.println("Godina " + i + " ima: " + numberOfDayinAYear(i) + " dana");
		}
	}

	// vraca broj dana
	public static int numberOfDayinAYear(int year) {
		// ako je godina prestupna vraca 366 dana
		if (isLeapYear(year)) {
			return 366;
		}
		// ako godina nije prestupna vraca 365 dana
		return 365;
	}

	// provjerava da li je godina prestupna
	public static boolean isLeapYear(int i) {
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			return true;
		return false;
	}

	// provjerava unos
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
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
