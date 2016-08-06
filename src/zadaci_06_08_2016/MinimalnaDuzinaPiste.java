package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinimalnaDuzinaPiste {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite brzinu u m/s: ");
		// unsemo brzinu i prvojerimo unos
		double brzina = checkInput();
		System.out.print("Unesite ubrzanje us m/s^2: ");
		// unesemo ubrzanje i provjerimo unos
		double ubrzanje = checkInput();
		// izracunavamo duzinu piste pomocu unijete formule
		System.out.printf("Duzina piste je: %3.3f", ((brzina * brzina) / (2 * ubrzanje)));
	}

	// provjerava unos
	public static double checkInput() {

		double num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextDouble();
				if (num < 0)
					throw new InputMismatchException("Negativan broj");
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unsite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
