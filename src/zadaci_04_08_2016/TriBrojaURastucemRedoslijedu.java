package zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriBrojaURastucemRedoslijedu {

	public static void displeySortedNumbers(double num1, double num2, double num3) {
		// metoda prvo uzima prva dva broja, ako je prvi veci, zamjene mjesta
		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		// uzima drugi i treci, ako je dugi veci zamjene mjesta
		if (num2 > num3) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		// i ponovo uzima prva dva, tj sada mjenja prvi i treci sa pocetka ako
		// je prvi manji
		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println("Brojevi u rastucem redoslijedu: " + num1 + " " + num2 + " " + num3);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean greska = true;
		double broj1 = 0;
		double broj2 = 0;
		double broj3 = 0;
		// petlja se obrce dok ne unesemo pravilno
		while (greska) {
			System.out.println("Unesite tri broja odvojena razmakom: ");
			try {
				broj1 = input.nextDouble();
				broj2 = input.nextDouble();
				broj3 = input.nextDouble();
				// kada unesemo brojeve petlja se prekida
				greska = false;
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos! ");
				input.nextLine();

			}
		}
		// prosledjujemo brojeve metodi
		displeySortedNumbers(broj1, broj2, broj3);
		input.close();
	}

}
