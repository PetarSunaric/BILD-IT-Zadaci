package zadaci_11_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaProsjekPozitivniINegativni {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int i = 1, pozitivni = 0, negativni = 0, count = 0;
		double suma = 0;
		// dok unos nije nula unosimo brojeve
		while (i != 0) {
			System.out.print("Unesite broj(nula prekida unos): ");
			i = checkInput();
			// brojeve dodajemo na sumu
			suma += i;
			// povecavamo broj brojeva
			count++;
			if (i < 0) {
				negativni++;
			} else if (i > 0) {
				pozitivni++;
			}
		}
		// count-1 je jer ne racunamo nulu
		System.out.println("Pozitivnih brojeva: " + pozitivni + ", negativnih brojeva: " + negativni
				+ ",suma brojeva je: " + suma + ", a prosjek: " + (suma / (count - 1)));

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
