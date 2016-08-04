package zadaci_03_08_2016;
/*Napisati metodu koja nalazi najmanji element u nizu 
 * decimalnih vrijednosti koristeæi se sljedeæim headerom:
 *public static double min(double[ ] array)
 *Napišite potom test program koji pita korisnika da unese 
 *deset brojeva te poziva ovu metodu da vrati najmanji element u nizu.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class NajmanjiElementUNizu {

	public static double min(double[] array) {
		// uzimamo prvi elemenat da nam je najmanji
		double min = array[0];
		// krecemo od drugog elementa
		for (int i = 1; i < array.length; i++) {
			// ako je nekakav elemenat niza manji od minimalnog on postaje
			// minimalni
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// pravimo niz sa 10 mjesta
		double[] niz = new double[10];
		boolean greska = true;
		System.out.print("Unesite 10 double vrijednosti: ");
		for (int i = 0; i < niz.length; i++) {
			greska = true;
			// korisnik unosi 10 vrijednosti sve dok ne napravi gresku
			// ako je napravi ponovo unosi vrijednosti.
			while (greska) {
				try {
					niz[i] = input.nextDouble();
					greska = false;
				} catch (InputMismatchException ex) {
					System.out.println("Pogresan unos! Pokusajte ponovo: ");
					//vracamo i na pocetak
					i = 0;
					input.nextLine();
				}
			}
		}
		// prosledjujemo niz metodi
		System.out.println("Najmanji element u nizu je: " + min(niz));
		input.close();
	}

}
