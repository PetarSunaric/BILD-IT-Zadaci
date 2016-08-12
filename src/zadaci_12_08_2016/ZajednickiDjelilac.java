package zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZajednickiDjelilac {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite prvi cijeli pozitivan broj: ");
		int broj1 = checkInput();
		System.out.print("Unesite drugi cijeli pozitivan broj: ");
		int broj2 = checkInput();
		// ako je broj2 manji onda zamjene mjesta
		if (broj1 < broj2)
			provjeriDjelioce(broj1, broj2);
		else
			provjeriDjelioce(broj2, broj1);
	}

	public static void provjeriDjelioce(int broj1, int broj2) {
		// provjerava najmanji djelilac
		for (int i = 2; i < broj1; i++) {
			if (broj1 % i == 0 && broj2 % i == 0) {
				System.out.print("Najmanji djelilac je: " + i);
				break;
			}
		}
		// provjerava najveci djelilac
		for (int i = broj1; i > 1; i--) {
			if (broj1 % i == 0 && broj2 % i == 0) {
				System.out.println(" a najveci djelilac je: " + i);
				break;
			}
		}

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
