package zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoljaCijena {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// unosimo tezine i cijene pakovanja
		System.out.print("Unesite tezinu prvog pakovanja u gramima: ");
		double tezinaPrvogPakovanja = checkInput();
		System.out.print("Unesite cijenu prvog pakovanja: ");
		double cijenaPrvogPakovanja = checkInput();
		System.out.print("Unesite tezinu drugog pakovanja u gramima: ");
		double tezinaDrugogPakovanja = checkInput();
		System.out.print("Unesite cijenu drugog pakovanja: ");
		double cijenaDrugogPakovanja = checkInput();
		// ako je prvo pakovanje isplativije ispisati
		if ((tezinaPrvogPakovanja / cijenaPrvogPakovanja) > (tezinaDrugogPakovanja / cijenaDrugogPakovanja))
			System.out.println("Isplativije je da kupite prvo pakovanje");
		// u suprotnom ispisati
		else
			System.out.println("Isplativije je da kupite drugo pakovanje");

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
