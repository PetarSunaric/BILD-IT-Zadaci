package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ASCIICode {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite cifru ASCII koda(broj od 0 do 127): ");
		int broj = checkInput();
		// broj kastujemo u char i dobijemo zeljeni karakter
		System.out.println("Karakter koji ste unijeli je:  " + (char) (broj));

	}

	// provjeravamo unos
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 0 || num > 127)
					throw new InputMismatchException("Nije ascii");
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
