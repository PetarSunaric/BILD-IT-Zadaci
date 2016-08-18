package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringFormat {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// unosimo broj i sirinu
		System.out.print("Unesite broj: ");
		int broj = checkInput();
		System.out.print("Unesite sirinu broja: ");
		int sirina = checkInput();
		// pozivamo metodu format
		System.out.println("Broj u string formatu izgleda ovako: " + format(broj, sirina));

	}

	public static String format(int number, int width) {
		// pretvaramo broj u string i pravimo string koji vracamo
		String broj = "" + number, str = "";
		// ukoliko je duzina broja veca ili jednaka prosledjenoj sirini vracamo
		// broj
		if (broj.length() >= width) {
			return broj;
		} else {
			// u suprotnom dodajemo nule ispred
			for (int i = 0; i < (width - broj.length()); i++) {
				str += "0";
			}
			str += broj;
		}
		return str;
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
