package zadaci_24_08_2016;

import java.math.BigInteger;

public class DivisibleByFiveAndSix {

	public static void main(String[] args) {

		// making instance of BigInteger with value of max long value
		BigInteger num = new BigInteger(Long.MAX_VALUE + "");
		int count = 0; // count numbers
		do {
			num = num.add(BigInteger.ONE); // increase numbers by 1
			// if number can be divided by 5 or 6 do:
			if (num.remainder(new BigInteger("5")).equals(BigInteger.ZERO)
					|| num.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) {
				System.out.println(num); // print num
				count++; // increase count of numbers
			}
		} while (count < 10);

	}

}
