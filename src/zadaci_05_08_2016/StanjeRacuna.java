package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StanjeRacuna {

	public static void usteda(double stednja, int mjeseci) {
		// izracunamo ustedu za prvi mjesec
		double sum = stednja * (1 + 0.00417);
		// krenemo od prvog mjeseca do broja mjeseci
		for (int i = 1; i < mjeseci; i++) {
			// koristimo ovu formulu kako bi povecali sums vaki mjesec
			sum = (stednja + sum) * (1 + 0.00417);
		}
		// ispisujemo ustedu sa 2 mjesta iza zareza
		System.out.printf("Vasa usteda za %2d mjeseci je: %4.2f", mjeseci, sum);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean greska = true;
		double stednja = 0;
		// petlja se vrti sve dok postoji greska
		while (greska) {
			try {
				System.out.print("Unesite mjesecni iznos stednje: ");
				stednja = input.nextDouble();
				// kada nema greske prekidamo petlju
				greska = false;
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos, pokusajte ponovo!");
				input.nextLine();
			}
		}
		int mjeseci = 0;
		greska = true;
		//// petlja se vrti sve dok postoji greska
		while (greska) {
			try {
				System.out.print("Unesite broj mjeseci nakon kojih bi zeljeli znati stanje racuna: ");
				mjeseci = input.nextInt();
				// kada nema greske prekidamo petlju
				greska = false;
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos, pokusajte ponovo!");
				input.nextLine();
			}
		}
		// prosledjujemo unijetu stednju i broj mjeseci metodi
		usteda(stednja, mjeseci);

		input.close();
	}

}
