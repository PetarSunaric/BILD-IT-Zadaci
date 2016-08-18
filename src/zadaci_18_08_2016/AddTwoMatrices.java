package zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddTwoMatrices {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// enter 2 matrices and create third one that will be sum of them, and
		// print all that
		System.out.println("Enter first 3X3 matrix: ");
		double[][] matrix1 = createMatrix();
		System.out.println("Enter second 3x3 matrix: ");
		double[][] matrix2 = createMatrix();
		double[][] resultMatrix = addMatrix(matrix1, matrix2);
		printResult(matrix1, matrix2, resultMatrix);
	}

	// creating matrix
	public static double[][] createMatrix() {
		double[][] matrix = new double[3][3];
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				matrix[x][y] = checkInput();
			}
		}
		return matrix;
	}

	// summing elements on same index of 2 matrices
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] matrix = new double[3][3];
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				matrix[x][y] = a[x][y] + b[x][y];
			}
		}
		return matrix;
	}

	// prints adding of two matrices
	public static void printResult(double[][] matrix1, double[][] matrix2, double[][] resultMatrix) {

		for (int i = 0; i < 3; i++) {
			// takes matrix and row number to print row
			printRow(matrix1, i);
			if (i == 1)
				System.out.print(" + ");
			else
				System.out.print("   ");
			printRow(matrix2, i);
			if (i == 1)
				System.out.print(" = ");
			else
				System.out.print("   ");
			printRow(resultMatrix, i);
			System.out.println();
		}
	}

	// prints specific row
	public static void printRow(double[][] matrix, int row) {
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.printf("%6.2f ", matrix[row][i]);
		}
	}

	// checks input
	public static double checkInput() {

		double num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextDouble();
				// if input is correct stops loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Wrong input, try again:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
