package zadaci_21_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RowSorting {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter 3x3 matrix: ");
		double[][] matrix = new double[3][3];
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				matrix[x][y] = checkInput();
			}
		}
		// sorted matrix is old matrix with sorted rows
		double[][] sortedMatrix = sortRows(matrix);
		printMatrix(sortedMatrix);
	}

	// sorting rows
	public static double[][] sortRows(double[][] m) {
		for (int x = 0; x < m.length; x++) {
			for (int y = 0; y < m[x].length; y++) {
				try {
					// if current element is bigger than next one they swap
					// places
					if (m[x][y] > m[x][y + 1]) {
						double temp = m[x][y];
						m[x][y] = m[x][y + 1];
						m[x][y + 1] = temp;
						// reseting loop
						y = -1;
					}
					// avoids ArrayIndexOutOfBounds exception
				} catch (ArrayIndexOutOfBoundsException ex) {
					continue;
				}
			}
		}
		return m;
	}

	// prints matrix with for-each loop
	public static void printMatrix(double[][] matrix) {
		for (double[] e : matrix) {
			for (double ex : e) {
				System.out.print(ex + " ");
			}
			System.out.println();
		}
	}

	// cheks input
	public static double checkInput() {

		double num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextDouble();
				// if input is correct stops loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unesite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
