package zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BrojNaopako {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite broj: ");
		// provjeravamo broj
		int broj = checkInput();
		reverse(broj);
	}

	public static void reverse(int number) {
		// dok je broj djeljiv sa 10 ispisuj zadnju cifru
		while (number % 10 != 0) {
			System.out.print(number % 10);
			// skidamo zadnju cifru sa broja
			number /= 10;
		}
	}

	// provjeravamo unos
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
