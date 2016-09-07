package zadaci_06_09_2016;

public class SumSeries {

	public static void main(String[] args) {

		// numbers from 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%2.2f\n", m(i));
		}

	}

	// returns sum of series of numbers
	public static double m(int i) {
		if (i <= 0)
			return 0;
		if (i == 1)
			return 1;
		else
			return m(i - 1) + 1.0 / i;

	}
}