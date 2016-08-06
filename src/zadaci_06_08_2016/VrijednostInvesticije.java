package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VrijednostInvesticije {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite iznos investicije: ");
		int investicija = checkInput();
		System.out.print("Unesite godisnju interesnu stopu: ");
		// mjesecnu interesnu stopu dobijamo tako sto podjelimo godisnju sa 12 i
		// onda podjelimo sa 100 jer je unesena u procentima
		double mjesecnaInteresnaStopa = checkInputD() / 1200;
		System.out.print("Unesite broj godina: ");
		int brojGodina = checkInput();
		//vrijednost investicije racunamo ovom formulom
		System.out.printf("Buduca vrijednost investicije je: %4.2f",
				(investicija * Math.pow(1 + mjesecnaInteresnaStopa, brojGodina * 12)));

	}

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
