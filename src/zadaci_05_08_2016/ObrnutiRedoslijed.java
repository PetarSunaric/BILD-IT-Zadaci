package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ObrnutiRedoslijed {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean greska = true;
		// pravimo niz od 10 mjesta
		int[] niz = new int[10];
		System.out.print("Unesite 10 brojeva:");
		for (int i = 0; i < niz.length; i++) {
			// kod ponovnog okretanja resetujemo greska
			greska = true;
			// petlja se vrti dok postoji greska
			while (greska) {
				try {
					niz[i] = input.nextInt();
					// ako je unos tacan prekidamo petlju
					greska = false;
				} catch (InputMismatchException ex) {
					System.out.println("Pogresan unos, pokusajte ponovo!");
					System.out.print("Unesite 10 brojeva:");
					// resetujemo unos na pocetak
					i = 0;
					input.nextLine();
				}
			}
		}
		// krecemo od zadnjeg elementa pa do elementa na nultom indexu
		System.out.println("Obrnuti redoslijed: ");
		for (int i = niz.length - 1; i >= 0; i--) {
			System.out.print(niz[i] + " ");
		}

		input.close();
	}

}
