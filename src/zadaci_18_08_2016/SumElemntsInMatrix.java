package zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumElemntsInMatrix {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double[][] matrix = new double[3][4];
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		// creates matrix
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				matrix[x][y] = checkInput();
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("Sum for coulumn " + i + " is: " + sumColumn(matrix, i));

		}

	}

	public static double sumColumn(double[][] m, int columnIndex) {
		// will contain sum for column
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			// adds numbers in same column to the sum
			sum += m[i][columnIndex];
		}
		return sum;
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
				System.out.print("Wrong input, enter again:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
