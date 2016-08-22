package projectNoThree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
	// 0 is empty field
	// 1 is X
	// 2 is O

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// creating matrix who has 0 as default values
		int[][] matrix = new int[3][3];
		int row1, column1, row2, column2;
		int countMoves = 0; // counting every move
		boolean play = true;
		while (play) {

			// FOR PLAYER X
			showTable(matrix);
			do {
				System.out.print("Enter a row (0, 1, or 2) for player X:");
				row1 = checkInput();
				System.out.print("Enter a column (0, 1, or 2) for player X:");
				column1 = checkInput();
				// will loop until user inputs correct input in blank space
			} while (isFilled(row1, column1, matrix));
			// fills empty space in specific index of matrix with X
			changeMatrix(1, matrix, row1, column1);
			countMoves++; // when user do a move it count's
			// if there is 9 moves all spaces are filled and it's draw
			if (countMoves == 9) {
				System.out.println("It's draw!");
				System.exit(1);
			}
			// if player win it will end program
			if (won(1, matrix)) {
				showTable(matrix);
				System.out.println("Player X won");
				System.exit(1);
			}

			// FOR PLAYER O
			showTable(matrix);
			do {
				System.out.print("Enter a row (0, 1, or 2) for player O:");
				row2 = checkInput();
				System.out.print("Enter a column (0, 1, or 2) for player O:");
				column2 = checkInput();
				// will loop until user inputs correct input in blank space
			} while (isFilled(row2, column2, matrix));
			// fills empty space in specific index of matrix with O
			changeMatrix(2, matrix, row2, column2);
			countMoves++;
			// if player win it will end program
			if (won(2, matrix)) {
				showTable(matrix);
				System.out.println("Player O won");
				System.exit(1);
			}
		}
	}

	// checks if field is filled
	public static boolean isFilled(int row, int column, int[][] matrix) {
		if (matrix[row][column] != 0) {
			System.out.println("Allready filled, try again!");
			return true;
		}
		return false;
	}

	// filling specific field with X or O
	public static void changeMatrix(int num, int[][] matrix, int row, int column) {

		if (num == 1) {
			matrix[row][column] = 1;
		} else
			matrix[row][column] = 2;
	}

	// checks if player wins the game
	public static boolean won(int num, int[][] matrix) {
		if (rowsAndColumns(num, matrix) || diagonal(num, matrix))
			return true;
		return false;

	}

	// checks if some of diagonals has same mark
	public static boolean diagonal(int num, int[][] matrix) {
		int countDecrease = 0, countIncrease = 0;
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				if (x == y) {
					if (matrix[x][y] == num)
						countDecrease++;
				}
				if (x + y == 2) {
					if (matrix[x][y] == num)
						countIncrease++;
				}
			}
		}
		if (countDecrease == 3 || countIncrease == 3)
			return true;
		return false;

	}

	// check if some row or column has same mark
	public static boolean rowsAndColumns(int num, int[][] matrix) {

		int countRows = 0, countColumns = 0;
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				if (matrix[x][y] == num)
					countRows++;
				if (matrix[y][x] == num)
					countColumns++;
				if (countColumns == 3 || countRows == 3)
					return true;
			}
			countColumns = 0;
			countRows = 0;
		}
		return false;

	}

	// prints tic tac toe table
	public static void showTable(int[][] matrix) {
		System.out.println("-------------");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("|");
				if (matrix[i][j] == 0)
					System.out.print("   ");
				else if (matrix[i][j] == 1)
					System.out.print(" X ");
				else
					System.out.print(" O ");
			}
			System.out.println("|");
			System.out.println("-------------");
		}
	}

	// check for input
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 0 || num > 2)
					throw new InputMismatchException("Not correct");
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
