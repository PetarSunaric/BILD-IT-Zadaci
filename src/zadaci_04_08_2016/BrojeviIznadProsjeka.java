package zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BrojeviIznadProsjeka {

	public static void countProsjek(int[] niz, double sum, int count) {
		// racunamo prosjek, suma svih brojeva podjeljeno sa broj brojeva
		double prosjek = sum / count;
		int iznadProsjeka = 0;
		int ispodProsjeka = 0;
		// petlja ide od nula do broja brojeva
		for (int i = 0; i < count; i++) {
			// ne brojimo nulu
			if (niz[i] != 0) {
				// ako je iznad ili jednako prosjeku povecavamo brojac
				if (niz[i] >= prosjek)
					iznadProsjeka++;
				else
					// u suprotnom povecavmo brojac ispod prosjeka
					ispodProsjeka++;
			}

		}
		System.out.println("Prosjek: " + prosjek + "\nBrojeva jednakih ili vecih od prosjeka: " + iznadProsjeka
				+ "\nBrojeva ispod prosjeka: " + ispodProsjeka);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// napravimo niz sa maksimalno 100 mjesta
		int[] niz = new int[100];
		boolean greska = true;
		double sum = 0;
		int count = 0;
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite broj (nula prekida unos): ");
			greska = true;
			// ukoliko unos nije tacan vrtice petlju
			while (greska) {
				try {
					niz[i] = input.nextInt();
					// odma nakon unosa sabira brojeve
					sum += niz[i];
					// prati count unijetih brojeva
					count++;
					// ako je unos tacan prekida petlju
					greska = false;
				} catch (InputMismatchException ex) {
					System.out.println("Pogresan unos! Pokusajte ponovo.");
					input.nextLine();
				}
			}
			// ako je unos bio nula prekidamo unosenje i ne racunamo nulu kao
			// unijeti broj
			if (niz[i] == 0) {
				count--;
				break;
			}
		}
		// saljemo niz unijetih brojeva, sumu i broj unijetih brojeva metodi
		countProsjek(niz, sum, count);
		input.close();
	}
}
