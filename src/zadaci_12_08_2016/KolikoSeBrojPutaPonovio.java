package zadaci_12_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KolikoSeBrojPutaPonovio {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// pravimo listu koja ce smjestati unijete brojeve
		ArrayList<Integer> list = new ArrayList<>();
		int i = 1;
		// dok unos nije 0 unosimo brojeve
		while (i != 0) {
			System.out.print("Unesite broj od 1 do 100(nula prekida unos): ");
			i = checkInput();
			// dodajemo broj u listu kad ga unesemo
			list.add(i);
		}
		putaPonovio(list);
	}

	public static void putaPonovio(ArrayList<Integer> list) {
		// brojac koliko se broj puta ponovio
		int count = 0;
		// uzimamo broj od 1 do 100 i jedan po jedan provjeravao da li se u
		// kiliko puta ponovio, svaki puta kad ga nadje u listi poveca brojac
		for (int i = 1; i < 101; i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				if (i == list.get(j))
					count++;
			}
			// kada prodje listu za odredjen broj ispise koliko se taj broj
			// ponovio i resetuje brojac
			if (count > 0) {
				System.out.print("Broj " + i + " se ponovio " + count + " put.");
				if (count != 11 || count % 10 == 1) {
					System.out.println("a");
				}
				count = 0;
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
				if (num < 0 || num > 100)
					throw new InputMismatchException("Izvan opsega");
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
