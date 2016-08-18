package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unicode {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite karakter: ");
		char ch = checkInput();
		// kastujemo char u int i dobijamo njegov unicode
		System.out.println("Unicode za uneseni karakter je: " + (int) (ch));

	}

	// provjerava unos
	public static char checkInput() {

		char ch = 0;
		boolean error = true; // check for error

		do {
			try {
				ch = input.next().charAt(0);
				// if input is correct stops loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unsite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return ch;
	}

}
