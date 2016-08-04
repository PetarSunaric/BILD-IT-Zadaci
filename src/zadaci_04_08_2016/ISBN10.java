package zadaci_04_08_2016;
/* ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva:
 *  d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi kao checksum
 * i njega izraèunavamo iz prvih devet brojeva koristeæi se sljedeæom formulom:
 *  (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11.
 *   Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom.
 *   Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše
 *   desetocifreni ISBN-10 broj. (Primjer: ukoliko unesemo, kao prvih 9 brojeva,
 *   013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. Ukoliko unesemo
 *   013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ISBN10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] niz = new int[9];
		boolean greska = true;
		// unosimo sve dok ima greska
		while (greska) {
			try {
				System.out.print("Upisite prvih 9 brojeva ISBN: ");
				for (int i = 0; i < niz.length; i++) {
					// prvih devet brojeva smjestamo u niz
					niz[i] = input.nextInt();
					// ISBN broj nema negativne cifre
					if (niz[i] < 0) {
						System.out.println("Pogresan unos! Unesite ponovo: ");
						i = -1;
						continue;
					}
					// kada je unos tacan prekidamo petlju
					greska = false;
				}
			} catch (InputMismatchException ex) {
				System.out.print("Pogresan unos! ");
				input.nextLine();
			}
		}
		// pravimo sumu koja ce sabrati prvih 9 brojeva
		double sum = niz[0];
		for (int i = 1; i < niz.length; i++) {
			// sum ce u svakom okretanju petlje dodavati na prethodnu sumu broj
			// na tome indexu pomnozen sa brojem za jedan vece od trenunto
			// indexa(jer krece od jednog manje(
			sum += niz[i] * (i + 1);
		}
		// mnozimo sumu sa 11% i pretvaramo u cijeli broj
		int desetaCifra = (int) sum % 11;
		System.out.print("ISBN je: ");
		// ispisujemo prbih 9 brojeva pomocu for-each petlje
		for (int e : niz) {
			System.out.print(e);
		}
		// ako je deseta cifra 10 ispisuje X, u suprotnom ispisuje cifru
		if (desetaCifra == 10) {
			System.out.println("X");
		} else {
			System.out.println(desetaCifra);
		}
		input.close();
	}

}
