package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StanjeRacuna {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Unesite mjesecni iznos stednje: ");
		double stednja = checkInputD();
		System.out.print("Unesite broj mjeseci: ");
		int mjeseci = checkInput();
		// prosledjujemo unijetu stednju i broj mjeseci metodi
		usteda(stednja, mjeseci);

	}

	public static void usteda(double stednja, int mjeseci) {
		// izracunamo ustedu za prvi mjesec
		double sum = stednja * (1 + 0.00417);
		// krenemo od prvog mjeseca do broja mjeseci
		for (int i = 1; i < mjeseci; i++) {
			// koristimo ovu formulu kako bi povecali sums vaki mjesec
			sum = (stednja + sum) * (1 + 0.00417);
		}
		// ispisujemo ustedu sa 2 mjesta iza zareza
		System.out.printf("Vasa usteda za %2d mjeseci je: %4.2f", mjeseci, sum);
	}

	// provjerava input za int vrijednosti
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
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

	// provjerava input za double vrijednosti
	public static double checkInputD() {

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
