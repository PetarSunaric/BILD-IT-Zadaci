package zadaci_04_08_2016;
/*Napisati program koji pita korisnika da unese neki cijeli broj
 *  te ispisuje njegove najmanje faktore u rastuæem redosljedu. 
 *  Na primjer, ukoliko korisnik unese 120 program treba da 
 *  ispiše 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)*/

import java.util.InputMismatchException;
import java.util.Scanner;

import zadaci_03_08_2016.ProstiBrojeviUZadanomRangu;

public class NajmanjiFaktori {

	public static void najmanjiFaktori(int broj) {
		// count koji nam broji
		boolean prost = true;
		System.out.println("Najmanji faktori broja " + broj + " su: ");
		// uzimamo interval od broja koji je za jedan manje od unijetog broja pa
		// do jedinice(ne ukljucujuci 1)
		for (int i = broj - 1; i > 1; i--) {
			// ako je unijeti broj djeljiv sa brojem u intervalu
			if (broj % i == 0) {
				// ispisujemo njihov rezultat
				System.out.print((broj / i) + " ");
				// i broj ce postati taj broj sa kojim je djeljiv
				broj = i;
				// kada dodjemo do poslednjeg broja koji se ne moze dijeliti ni
				// sa jednim, ispisujemo ga
				if (i < 4||ProstiBrojeviUZadanomRangu.isPrime(i)) {
					System.out.println(i);
				}
				// ako je uslo u if petlju broj nije prost
				prost = false;
			}
		}
		// ako je broj prost to i ispise
		if (prost) {
			System.out.println(broj + " je prost broj!");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj: ");
		boolean greska = true;
		int broj = 0;
		// unos se vrti sve dok ne unesemo pravilno
		while (greska) {
			try {
				broj = input.nextInt();
				// kada se unese pravilno prekidamo unos
				greska = false;
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos! Unesite ponovo: ");
				input.nextLine();
			}
		}
		najmanjiFaktori(broj);
		input.close();
	}
}
