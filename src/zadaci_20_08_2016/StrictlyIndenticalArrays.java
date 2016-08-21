package zadaci_20_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StrictlyIndenticalArrays {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter list1: ");
		int[][] matrix1 = createMatrix();
		System.out.println("Enter list2: ");
		int[][] matrix2 = createMatrix();
		// depends on if two matrices are identical writes message
		if (equals(matrix1, matrix2)) {
			System.out.println("The two arrays are strictly identical");
		} else {
			System.out.println("The two arrays are not strictly identical");
		}

	}

	// checks if two matrices are strictly identical
	public static boolean equals(int[][] m1, int[][] m2) {
		for (int x = 0; x < m2.length; x++) {
			for (int y = 0; y < m2.length; y++) {
				// if founds elements on same index that are different it will
				// return false
				if (m1[x][y] != m2[x][y])
					return false;
			}
		}
		return true;
	}

	// creating matrix
	public static int[][] createMatrix() {
		int[][] matrix = new int[3][3];
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				matrix[x][y] = checkInput();
			}
		}
		return matrix;
	}

	// checks input
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
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
