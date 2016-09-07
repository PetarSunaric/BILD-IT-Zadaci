package zadaci_06_09_2016;

public class SumSeries2 {

	public static void main(String[] args) {

		// numbers from 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%2.2f\n",sumSeries(i));
		}
	}

	// return sum of series of numbers
	public static double sumSeries(int n) {

		if (n == 1)
			return 1.0 / 3;
		else
			return sumSeries(n - 1) + n / (2.0 * n + 1);
	}

}