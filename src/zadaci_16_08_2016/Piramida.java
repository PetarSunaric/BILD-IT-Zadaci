package zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Piramida {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite pozitivan cijeli broj: ");
		int n = checkInput();
		System.out.println("Piramida: \n");
		// prva petlja prestavlja broj redova
		for (int i = 0; i < n; i++) {
			// prva ugnjezdena petlja koja pise prazna polja
			for (int j = 0; j < n - i; j++)
				System.out.print(" ");
			// druga ugnjezdena petlja koja ispisuje lijevu stranu piramide
			for (int j = i; j > 0; j--) {
				System.out.print(j + 1);
			}
			// treca ugnjezdena petlja koja ispisuje desnu stranu piramide.
			for (int j = 0; j < i + 1; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
	}

	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 1)
					throw new InputMismatchException("Pogresan unos");
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
