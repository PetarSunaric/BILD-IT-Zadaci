package zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RastuciRedoslijedTriBroja {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite prvi broj: ");
		int broj1 = checkInput();
		System.out.print("Unesite drugi broj: ");
		int broj2 = checkInput();
		System.out.print("Unesite treci broj: ");
		int broj3 = checkInput();
		// saljemo brojeve metodi
		sort(broj1, broj2, broj3);
	}

	// sortira brojeve
	public static void sort(int broj1, int broj2, int broj3) {
		// ubacimo brojeve u niz i sortiramo
		int[] niz = { broj1, broj2, broj3 };
		java.util.Arrays.sort(niz);
		System.out.println("Brojevi u rastucemo redoslijedu: " + niz[0] + " " + niz[1] + " " + niz[2]);

	}

	// provjerava unos
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
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
