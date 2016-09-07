package zadaci_06_09_2016;

public class SumSeries3 {

	public static void main(String[] args) {

		//numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2.2f\n",m(i));
        }
    }
	//return sum of series of numbers
    private static double m(int i) {
        if (i == 1)
            return 1 / 2.0;
        else
            return m(i - 1) + i / (i + 1.0);
    }
}
