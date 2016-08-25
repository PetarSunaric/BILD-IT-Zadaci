package zadaci_24_08_2016;

import java.math.BigInteger;

public class LargePrimeNumbers {

	public static void main(String[] args) {

		// makes instance of BigInteger with max long value
		BigInteger num = new BigInteger(Long.MAX_VALUE + "");
		int count = 0; // counting prime numbers
		do {
			// increase num by 1
			num = num.add(BigInteger.ONE);
			if (isPrime(num)) { // if num is prime
				System.out.println(num);// print it
				count++; // and increase count of prime numbers
			}
		} while (count < 10);
	}

	// checks if number is prime
	public static boolean isPrime(BigInteger num) {
		for (BigInteger i = new BigInteger("2"); i.compareTo(num) < 0; i = i.add(BigInteger.ONE)) {
			if (num.remainder(i).equals(BigInteger.ZERO)) {
				return false;
			}
		}
		return true;
	}
}
