package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ObrnutiRedoslijed {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// pravimo niz od 10 mjesta
		int[] niz = new int[10];
		System.out.print("Unesite 10 brojeva odvojenih razmakom:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = checkInput();
		}
		// krecemo od zadnjeg elementa pa do elementa na nultom indexu
		System.out.println("Obrnuti redoslijed: ");
		for (int i = niz.length - 1; i >= 0; i--) {
			System.out.print(niz[i] + " ");
		}

	}

	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 0)
					throw new InputMismatchException("Negativan broj");
				// stops loop if input is correct
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unsite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
