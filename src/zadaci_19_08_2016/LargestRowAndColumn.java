package zadaci_19_08_2016;

public class LargestRowAndColumn {

	public static void main(String[] args) {

		// making matrix filled with 0 and 1
		int[][] matrix = new int[4][4];
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				matrix[x][y] = (int) (Math.random() * 2);
			}
		}
		printMatrix(matrix);
		largestRow(matrix);
		largestColumn(matrix);

	}

	// printing matrix with for-each loop
	public static void printMatrix(int[][] matrix) {
		for (int[] e : matrix) {
			for (int ex : e) {
				System.out.print(ex + " ");
			}
			System.out.println();
		}
	}

	// printing largest row in matrix
	public static void largestRow(int[][] matrix) {
		int sum = 0, maxSum = 0, index = 0;
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				// first we sum elements in row
				sum += matrix[x][y];
			}
			// if sum is larger than maximum sum maximum sum will become sum and
			// index will become that row
			if (sum > maxSum) {
				maxSum = sum;
				index = x;
			}
			sum = 0;
		}
		System.out.println("Largest row is: " + index);
	}

	public static void largestColumn(int[][] matrix) {
		int sum = 0, maxSum = 0, index = 0;
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				// first we sum elements in column
				sum += matrix[y][x];
			}
			// if sum is larger than maximum sum maximum sum will become sum and
			// index will become that column
			if (sum > maxSum) {
				maxSum = sum;
				index = x;
			}
			sum = 0;
		}
		System.out.println("Largest column is: " + index);
	}

}
