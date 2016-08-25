package zadaci_24_08_2016;

import java.math.BigInteger;

public class SquareNumbers {

	public static void main(String[] args) {

		// taking root from max value of long
		long number = (long) (Math.sqrt(Long.MAX_VALUE));
		// making instance of bigDecimal
		BigInteger num = new BigInteger(number+"");
		int count = 0; // counter for numbers
		do {
			// increasing num by 1
			num = num.add(BigInteger.ONE);
			// prints num*num
			System.out.println(num.multiply(num));
			count++; // increase count of numbers
		} while (count < 10);
	}

}
