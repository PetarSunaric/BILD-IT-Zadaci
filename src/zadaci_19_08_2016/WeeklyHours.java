package zadaci_19_08_2016;

public class WeeklyHours {

	public static void main(String[] args) {

		// creates matrix with random working hours
		int[][] matrix = new int[8][7];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (1 + Math.random() * 9);
			}
		}
		// shows matrix with all hours
		showHours(matrix);
		// computes hours for every employee
		int[][] finalHours = computeHours(matrix);
		// printing employee with sum of hours in decreasing order
		printFinalHours(finalHours);

	}

	// printing employee with sum of hours in decreasing order
	public static void printFinalHours(int[][] matrix) {
		int[][] matrix2 = decreseOrderMatrix(matrix);
		for (int x = 0; x < matrix2.length; x++) {
			System.out.print("Employee " + matrix2[x][0] + " has worked ");
			System.out.println(matrix2[x][1] + " hours");
		}

	}

	// returns matrix in decreasing order
	public static int[][] decreseOrderMatrix(int[][] matrix) {
		for (int x = 1; x < matrix.length; x++) {
			try {
				// if employee in front has less working hour swap them
				if (matrix[x][1] < matrix[x + 1][1]) {
					int temp = matrix[x][1];
					matrix[x][1] = matrix[x + 1][1];
					matrix[x + 1][1] = temp;
					int temp2 = matrix[x][0];
					matrix[x][0] = matrix[x + 1][0];
					matrix[x + 1][0] = temp2;
					x = -1;
				}
				// using exception to avoid error
			} catch (ArrayIndexOutOfBoundsException ex) {
				continue;
			}
		}
		return matrix;
	}

	// computing all weakly hours
	public static int[][] computeHours(int[][] matrix) {
		int sum = 0;
		int[][] sumOfHours = new int[8][2];
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				sum += matrix[x][y];
			}
			sumOfHours[x][1] = sum;
			sumOfHours[x][0] = x;
			sum = 0;
		}
		return sumOfHours;
	}

	// shows working hours for whole week
	public static void showHours(int[][] matrix) {
		System.out.println("\t    Sun Mon Tue Wed Thu Fri Sat");
		for (int x = 0; x < matrix.length; x++) {
			System.out.print("Employee " + x + "|  ");
			for (int y = 0; y < matrix[x].length; y++) {
				System.out.print(matrix[x][y] + "   ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
