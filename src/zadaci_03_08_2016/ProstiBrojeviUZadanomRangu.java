package zadaci_03_08_2016;
/* Napisati metodu koja prima 2 argumenta: poèetni broj
 *  i krajnji broj te printa sve proste brojeve u zadanom rangu.
BONUS: metoda može primati i treæi argument, broj brojeva za isprintati po liniji.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProstiBrojeviUZadanomRangu {
	// metoda ispituje da li je broj prost
	public static boolean isPrime(int broj) {
		for (int i = 2; i < broj; i++) {
			// ako je djeljiv sa bilo kojim brojem sem sebe nije prost.
			if (broj % i == 0)
				return false;
		}
		return true;
	}

	public static void prostiBrojevi(int broj1, int broj2, int brPoLiniji) {
		int count = 0;
		// uzimamo raspon od prvog do drugog broja
		for (int i = broj1; i <= broj2; i++) {
			if (isPrime(i)) {
				// ako je broj prost povecavamo count prostih brojeva
				count++;
				// kada je count prostih brojeva djeljiva sa brojem brojeva po
				// liniji prelazi u novi red
				if (count % brPoLiniji == 0) {
					System.out.println(i + " ");
				} else {
					System.out.print(i + " ");
				}
			}

		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int broj1 = 0, broj2 = 0;
		boolean greska = true;
		while (greska) {
			// korisnik unosi dva broja
			try {
				System.out.print("Unesite pocetni i krajnji broj odvojene razmakom: ");
				broj1 = input.nextInt();
				broj2 = input.nextInt();
				greska = false;
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos! Pokusajte ponovo\n");
				input.nextLine();
			}
		}
		greska = true;
		int brojeviPoLiniji = 0;
		while (greska) {
			try {
				// koliko brojeva je po liniji
				System.out.print("Koliko brojeva zelite da se isprinta po liniji? ");
				brojeviPoLiniji = input.nextInt();
				greska = false;
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos! Pokusajte ponovo\n");
				input.nextLine();
			}
		}
		// prosledjuje unos metodi
		if (broj1 < broj2) {
			prostiBrojevi(broj1, broj2, brojeviPoLiniji);
		} else {
			// ako je broj2 manji zamjene mjesta
			prostiBrojevi(broj2, broj1, brojeviPoLiniji);
		}

		input.close();
	}

}
