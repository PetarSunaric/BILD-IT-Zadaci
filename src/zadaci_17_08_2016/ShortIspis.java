package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShortIspis {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite broj short tipa(od -32768 do 32767): ");
		short broj = checkInput();
		// pretvaramo broj u binarni broj
		String str = Integer.toBinaryString(broj);
		// ukoliko je broj pozitivan ili 0 ispisujemo nule prije broja
		if (broj >= 0) {
			for (int i = 0; i < 16 - str.length(); i++)
				System.out.print("0");
			System.out.print(str);
			// ukoliko nije ispisujemo ga od 16 pozicije int broja
		} else {
			for (int i = 16; i < str.length(); i++) {
				System.out.print(str.charAt(i));
			}
		}
	}

	// provjerava unos
	public static short checkInput() {

		short num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextShort();
				if (num < -32768 || num > 32767)
					throw new InputMismatchException("Van dometa");
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
