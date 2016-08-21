package zadaci_21_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LocationWithTest {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// enters number of rows and columns
		System.out.print("Enter number of rows: ");
		int rows = checkInput();
		System.out.print("Enter number of columns: ");
		int columns = checkInput();

		double[][] matrix = createMatrix(rows, columns);

		Location lc = locateLargest(matrix);
		System.out.println(
				"Largest element is " + lc.maxValue + " and it is on position (" + lc.row + "," + lc.column + ")");
	}

	// creating matrix
	public static double[][] createMatrix(int row, int column) {
		double[][] matrix = new double[row][column];
		System.out.println("Enter the matrix: ");
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				matrix[x][y] = input.nextDouble();
			}
		}
		return matrix;
	}

	// finding largest element using Location class
	public static Location locateLargest(double[][] a) {
		Location lc = new Location();
		lc.maxValue = a[0][0];
		for (int x = 1; x < a.length; x++) {
			for (int y = 1; y < a.length; y++) {
				if (a[x][y] > lc.maxValue) {
					lc.maxValue = a[x][y];
					lc.column = y;
					lc.row = x;
				}
			}
		}
		return lc;
	}

	// checks input
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 1)
					throw new InputMismatchException("Broj rodova ili kolona ne moze biti manji od 1");
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

// class that will store largest element in matrix and his location
class Location {

	public int row;
	public int column;
	public double maxValue;

	Location() {
	}
}
