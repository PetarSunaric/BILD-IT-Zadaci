package zadaci_27_08_2016;

import java.util.ArrayList;

public class LargestRowAndColumn {

	public static void main(String[] args) {

		// making matrix 4*4 randomly filled with 0 and 1
		int[][] matrix = new int[4][4];
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				matrix[x][y] = (int) (Math.random() * 2);
			}
		}
		// prints matrix
		System.out.println("The random array is: ");
		for (int[] e : matrix) {
			for (int ex : e) {
				System.out.print(ex + " ");
			}
			System.out.println();
		}
		largestRows(matrix);
		System.out.println();
		largestColumns(matrix);
	}

	// finding rows with most one's
	public static void largestRows(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0, max = 0;
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				if (matrix[x][y] == 1) {// if element in that space is 1
										// increase count
					count++;
				}
			}
			if (count > max) { // if this row has more one's than rows before
				list.clear(); // clear list
				list.add(x); // and add this row to list
				max = count; // and max row will become this row
			} else if (count == max) { // if this row has same num of one's as
										// rows before
				list.add(x); // add him to list
			}
			count = 0; // reset count
		}
		System.out.println("The largest row index: ");
		for (int i = 0; i < list.size(); i++) { // and print list
			System.out.print(list.get(i) + " ");
		}
	}

	// finding columns with most one's
	public static void largestColumns(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0, max = 0;
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				if (matrix[y][x] == 1) {// if element in that space is 1
										// increase count
					count++;
				}
			}
			if (count > max) {// if this column has more one's than columns
								// before
				list.clear(); // clear list
				list.add(x);// and add this column to list
				max = count; // and max column will become this column
			} else if (count == max) {// if this column has same number of one's
										// as
										// columns before
				list.add(x);// add him to list
			}
			count = 0;// reset count
		}
		System.out.println("The largest column index: ");
		for (int i = 0; i < list.size(); i++) { // and print list
			System.out.print(list.get(i) + " ");
		}
	}
}
