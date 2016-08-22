package projectNoThree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConnectFour {
	/*
	 * 0 is empty space
	 * 1 is red(R) 
	 * 2 is yellow(Y)
	 */

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// making matrix that will store values
		int[][] matrix = new int[6][7];
		int column, countMoves = 0; // countMoves will store number of plays
		boolean play = true;
		while (play) {
			// RED PLAYER
			showTable(matrix);
			do {
				System.out.print("Drop a red disk at column (0–6): ");
				column = checkInput();
				// if we choose used field it will alert us
			} while (isFull(column, matrix));
			// changes value in matrix from 0 to 1 for specific column
			changeTable(1, column, matrix);
			countMoves++; // after change count move
			// if player win's notice and exit
			if (won(1, matrix)) {
				showTable(matrix);
				System.out.println("Red player won!");
				System.exit(1);
			}

			// YELLOW PLAYER
			showTable(matrix);
			do {
				System.out.print("Drop a yellow disk at column (0–6): ");
				column = checkInput();
				// if we choose used field it will alert us
			} while (isFull(column, matrix));
			// changes value in matrix from 0 to 2 for specific column
			changeTable(2, column, matrix);
			countMoves++;// after change count move
			if (countMoves == 42) { // if all field are filled write Draw and
									// exit
				System.out.println("Draw!");
				System.exit(1);
			}
			// if player win's notice and exit
			if (won(2, matrix)) {
				showTable(matrix);
				System.out.println("Yellow player won!");
				System.exit(1);
			}
		}

	}

	// checks if player win
	public static boolean won(int num, int[][] matrix) {
		if (columnsAndRows(num, matrix) || diagonals(num, matrix)) {
			return true;
		}
		return false;
	}

	// checks is there are 4 same elements one by one in row or column
	public static boolean columnsAndRows(int num, int[][] matrix) {
		int countRows = 0, countColumns = 0;

		// check for rows
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				if (matrix[x][y] == num) {
					countRows++;
					if (countRows == 4)
						return true;
				} else
					countRows = 0;
			}
		}

		// check for columns
		for (int x = 0; x < matrix[0].length; x++) {
			for (int y = 0; y < matrix.length; y++) {
				if (matrix[y][x] == num) {
					countColumns++;
					if (countColumns == 4)
						return true;
				} else
					countColumns = 0;

			}
		}
		return false;
	}

	// checks is there are 4 same elements one by one in diagonals
	public static boolean diagonals(int num, int[][] matrix) {

		// increasing diagonal
		for (int i = 5; i >= 3; i--) {
			for (int j = 0; j <= 4; j++) {
				try {
					if (matrix[i][j] != 0 && matrix[i][j] == matrix[i - 1][j + 1]
							&& matrix[i][j] == matrix[i - 2][j + 2] && matrix[i][j] == matrix[i - 3][j + 3])
						return true;
				} catch (ArrayIndexOutOfBoundsException ex) {
					continue;
				}
			}
		}
		// decreasing diagonal
		for (int i = 5; i >= 3; i--) {
			for (int j = 3; j <= 6; j++) {
				if (matrix[i][j] != 0 && matrix[i][j] == matrix[i - 1][j - 1] && matrix[i][j] == matrix[i - 2][j - 2]
						&& matrix[i][j] == matrix[i - 3][j - 3])
					return true;
			}
		}
		return false;
	}

	// checks if specific field is full
	public static boolean isFull(int column, int[][] matrix) {
		for (int x = 0; x < matrix.length; x++) {
			if (matrix[x][column] == 0) {
				return false;
			}
		}
		System.out.println("That column is full, try another one");
		return true;
	}

	// changing value of the table
	public static void changeTable(int num, int column, int[][] matrix) {
		for (int x = matrix.length - 1; x >= 0; x--) {
			if (!isFilled(x, column, matrix)) {
				matrix[x][column] = num;
				break;
			}

		}
	}

	// checks if column if full
	public static boolean isFilled(int row, int column, int[][] matrix) {
		if (matrix[row][column] != 0) {
			return true;
		}
		return false;
	}

	// printing table
	public static void showTable(int[][] matrix) {
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				System.out.print("|");
				if (matrix[x][y] == 0) {
					System.out.print("   ");
				} else if (matrix[x][y] == 1)
					System.out.print(" R ");
				else
					System.out.print(" Y ");
			}
			System.out.println("|");
		}
		System.out.println("-----------------------------");
	}

	// checks input
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 0 || num > 6)
					throw new InputMismatchException();
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
