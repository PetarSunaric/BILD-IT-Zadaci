package zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrom {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// unosimo broj
		System.out.println("Unesite trocifren broj: ");
		int broj = checkInput();
		// ako su prva i poslednja cifra jednake broj je palindrom.
		if (broj / 100 == broj % 10)
			System.out.println("Broj je palindrom!");
		else
			System.out.println("Broj nije palindrom!");
	}

	// provjerava unos
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 100 || num > 999)
					throw new InputMismatchException("Nije trocifren");
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
