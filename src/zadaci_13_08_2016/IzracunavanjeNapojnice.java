package zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IzracunavanjeNapojnice {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Unesite iznos racuna: ");
		double racun = checkInput();
		System.out.println("Unesite procenat napojnice: ");
		double procenatNapojnice = checkInput();
		// napojnica se racuna kao procenat pomnozen racunom kroz 100
		double napojnica = procenatNapojnice * racun / 100;
		// ukupan racun je uneseni racun + napojnica
		System.out.println("Ukupan racun je: " + (racun + napojnica) + ", iznos napojnice je " + napojnica);
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
