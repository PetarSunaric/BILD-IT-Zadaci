package zadaci_19_08_2016;

public class SortTwoDimensionalArray {

	public static void main(String[] args) {

		// generates matrix with random pairs
		int[][] matrix = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		sort(matrix);
		printMatrix(matrix);

	}

	// prints matrix with for-each loop
	public static void printMatrix(int[][] matrix) {
		for (int[] e : matrix) {
			for (int ex : e) {
				System.out.print(ex);
			}
			System.out.println();
		}
	}

	// sorting rows
	public static void sort(int[][] matrix) {

		for (int x = 0; x < matrix.length - 1; x++) {
			int currentIndex = x;
			int[] current = matrix[x];
			for (int i = x + 1; i < matrix.length; i++) {
				if (current[0] > matrix[i][0] || current[0] == matrix[i][0] && current[1] > matrix[i][1]) {
					current = matrix[i];
					currentIndex = i;
				}
			}
			// Swap matrix[x] with matrix[currentIndex] if necessary
			if (currentIndex != x) {
				matrix[currentIndex] = matrix[x];
				matrix[x] = current;
			}
		}

	}

}
