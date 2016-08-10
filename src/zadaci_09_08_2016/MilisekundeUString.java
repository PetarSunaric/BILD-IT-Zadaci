package zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MilisekundeUString {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite broj milisekundi: ");
		long broj = checkInput();
		System.out.println("Pretvoreno u string: " + convertMillis(broj));
	}

	public static String convertMillis(long millis) {
		int ukupnoSekundi = (int) millis / 1000;
		// broj sekundi dobijamo kada uzmemo ostatak od ukupog broja sekundi
		int sekunde = ukupnoSekundi % 60;
		// kada ukupno sekundi podjelimo sa 60 dobijemo ukupno minuta i ostatak
		// od toga je trenute minute
		int minuta = ukupnoSekundi / 60 % 60;
		// sat ima 3600 sekundi
		int sati = ukupnoSekundi / 3600;
		return sati + ":" + minuta + ":" + sekunde;
	}

	// provjera unosa
	public static long checkInput() {

		long num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextLong();
				if (num < 0)
					throw new InputMismatchException("Negativan broj");
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
