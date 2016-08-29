package projectNo4;

import java.util.InputMismatchException;
import java.util.Scanner;

//0 empty
//1 part of ship
//X(2) is correct hit
//O(3) is wrong hit
public class Battleship {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// creates matrix table 10x10
		int[][] matrix = new int[10][10];

		setGame(matrix);// sets ships on table

		boolean play = true;
		while (play) {
			printTable(matrix);

			System.out.print("Choose row: ");
			int row = checkInput();
			System.out.println("Choose column: ");
			int column = checkInput();

			changeTable(matrix, (row - 1), (column - 1));// -1 because java is
															// zero base
			// checks if player won
			if (allShipsSunk(matrix)) {
				printTable(matrix);
				System.out.println("#               You won!                  #");
				System.out.println("###########################################");
				System.exit(1);
			}
		}

	}

	// check if there is no ship anymore
	public static boolean allShipsSunk(int[][] matrix) {
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				if (matrix[x][y] == 1)
					return false;
			}
		}
		return true;
	}

	// changes table depends on user choose
	public static void changeTable(int[][] matrix, int row, int column) {
		if (matrix[row][column] == 0) {
			matrix[row][column] = 3;
		} else if (matrix[row][column] == 1)
			matrix[row][column] = 2;
		else {
			System.out.println("Allready chosen!");
		}
	}

	// prints table for player
	public static void printTable(int[][] matrix) {
		System.out.println("##########################################");
		System.out.print("    ");
		for (int i = 0; i < 10; i++)
			System.out.print((i + 1) + "   ");// prints column numbers
		System.out.println();
		System.out.println("  -----------------------------------------");
		for (int x = 0; x < matrix.length; x++) {
			if (x != 9)
				System.out.print((x + 1) + " |"); // prints row numbers
			else
				System.out.print(10 + "|");
			for (int y = 0; y < matrix[x].length; y++) {
				if (matrix[x][y] == 2) {
					System.out.print(" X |");// prints X for hit
				} else if (matrix[x][y] == 3)
					System.out.print(" O |");// prints O for miss
				else
					System.out.print("   |");// prints empty field for not
												// played fields
			}
			System.out.println("\n  -----------------------------------------");
		}
		System.out.println("###########################################");
	}

	// sets the ships on field
	public static void setGame(int[][] matrix) {
		// 4 field ship
		for (int i = 1; i < 5; i++) {
			matrix[i][0] = 1;
		}
		// 3 field ship
		for (int i = 7; i < 10; i++) {
			matrix[i][0] = 1;
		}
		// 5 field ship
		for (int i = 4; i < 9; i++) {
			matrix[3][i] = 1;
		}
		// 2 field
		matrix[6][5] = 1;
		matrix[6][6] = 1;
		// 3 field
		for (int i = 7; i < 10; i++) {
			matrix[8][i] = 1;
		}
	}

	// checks input
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 1 || num > 10)
					throw new InputMismatchException();
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
