package zadaci_19_08_2016;

public class EvenNumberOfOnes {

	public static void main(String[] args) {

		// making matrix filled with 0 and 1
		int[][] matrix = new int[6][6];
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				matrix[x][y] = (int) (Math.random() * 2);
			}
		}
		printMatrix(matrix);
		rowWithEvenNumbers(matrix);
		System.out.println();
		columnWithEvenNumbers(matrix);

	}

	// printing matrix with for-each loop
	public static void printMatrix(int[][] matrix) {
		for (int[] e : matrix) {
			for (int ex : e) {
				System.out.print(ex + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void rowWithEvenNumbers(int[][] matrix) {
		int sum = 0;
		System.out.print("Rows that have even number of 1's are: ");
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				sum += matrix[x][y];
			}
			if (sum % 2 == 0) {
				System.out.print(x + " ");
			}
			sum = 0;
		}
	}

	public static void columnWithEvenNumbers(int[][] matrix) {
		int sum = 0;
		System.out.print("Columns that have even number of 1's are: ");
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				sum += matrix[y][x];
			}
			if (sum % 2 == 0) {
				System.out.print(x + " ");
			}
			sum = 0;
		}
	}
}
