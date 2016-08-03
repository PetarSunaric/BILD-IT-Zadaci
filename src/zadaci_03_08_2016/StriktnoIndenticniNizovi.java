package zadaci_03_08_2016;
/*Nizovi niz1 i niz2 su striktno identièni ukoliko su svi
 *  njihovi elementi na istim pozicijama jednaki.
 *Napisati metodu koja vraæa true ukoliko su nizovi niz1 i niz2
 * striktno identièni. Koristiti sljedeæi header:

 *public static boolean equals(int[ ] niz1, int[ ] niz2)

 *Napisati testni program koji pita korisnika da unese dva niza
 * cijelih brojeva te provjerava da li su striktno identièni.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class StriktnoIndenticniNizovi {

	public static boolean equals(int[] niz1, int[] niz2) {
		// napravimo count istih elemenata niza.
		int count = 0;
		for (int i = 0; i < niz1.length; i++) {
			// ako su elementi na istim indeksima isti, povecavamo count za 1
			if (niz1[i] == niz2[i]) {
				count++;
			}
		}
		// ako count nije isti kao duzina niza tj ako svi elementi nisu isti
		// vraca false
		if (count != niz1.length) {
			return false;
		}
		// u suprotnom vraca true
		return true;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// pravimo dva niza od po 5 elemenata
		int[] niz1 = new int[5];
		int[] niz2 = new int[5];
		boolean greska = true;
		// unosimo prvi niz, ukoliko korisnik pogresno unese upozoravamo ga
		// sve dok ne unese tacno
		System.out.print("Unesite prvi niz do 5 brojeva: ");
		for (int i = 0; i < niz1.length; i++) {
			greska = true;
			while (greska) {
				try {
					niz1[i] = input.nextInt();
					// kada unese tacno prekidamo petlju
					greska = false;
				} catch (InputMismatchException ex) {
					System.out.print("Pogresan unos! Unesite ponovo: ");
					// resetujemo i kako bi unos isao ispocetka
					i = 0;
					input.nextLine();
				}
			}
		}
		// unosimo prvi niz, ukoliko korisnik pogresno unese upozoravamo ga
		// sve dok ne unese tacno
		System.out.print("Unesite drugi niz od pet brojeva: ");
		for (int i = 0; i < niz2.length; i++) {
			greska = true;
			while (greska) {
				try {
					niz2[i] = input.nextInt();
					// kada unese tacno prekidamo petlju
					greska = false;
				} catch (InputMismatchException ex) {
					System.out.print("Pogresan unos! Unesite ponovo: ");
					// resetujemo i kako bi unos isao ispocetka
					i = 0;
					input.nextLine();
				}
			}
		}
		// proslijedimo dva niza meodi, i ispisemo jesu li ili nisu striktno
		// indenticni
		if (equals(niz1, niz2)) {
			System.out.println("Nizovi su striknto indenticni!");
		} else {
			System.out.println("Nizovi nisu striktno indenticni!");
		}
		input.close();
	}

}
