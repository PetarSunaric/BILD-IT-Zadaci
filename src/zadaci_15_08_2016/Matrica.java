package zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrica {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// unesemo N i proslijedimo matrici
		System.out.println("Unesite N matrice: ");
		int n = checkInput();
		printMatrix(n);

	}

	public static void printMatrix(int n) {
		// n postaje broj redova i kolona matrice
		int[][] matrica = new int[n][n];
		// prolazimo kroz matricu i printamo 0 ili 1
		for (int x = 0; x < matrica.length; x++) {
			for (int y = 0; y < matrica[x].length; y++) {
				System.out.print((int) (Math.random() * 2) + " ");
			}
			// kad zavrsi red predji u novi red
			System.out.println();
		}
	}

	// provjerava unos
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 1)
					throw new InputMismatchException("Pogresan unos!");
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
