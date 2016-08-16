package zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SSNFormat {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite broj u DDD-DD-DDDD formatu(D je broj):");
		// unosimo broj
		String broj = checkInput();
		System.out.println(broj + "je tacan unos!");
	}

	public static String checkInput() {

		String num = "";
		boolean error = true; // provjerava unose
		// pravimo niz u koji smjestamo indexe brojeva.
		int[] niz = { 0, 1, 2, 4, 5, 7, 8, 9, 10 };
		do {
			try {
				num = input.next();
				for (int i = 0; i < niz.length; i++) {
					// ako duzina unosa nije 11 ili ako karakteri na 3 i 6
					// indexu nisu "-" ili ako karakteri na ostalim indexima
					// nisu brojevi prijavljujemo gresku i unosimo ponovo
					if (num.length() != 11 || num.charAt(3) != '-' || num.charAt(6) != '-'
							|| !Character.isDigit(num.charAt(niz[i])))
						throw new InputMismatchException("Pogresan unos");
				}
				// ako je unos tacan zaustavlja petlju
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unsite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}

}
