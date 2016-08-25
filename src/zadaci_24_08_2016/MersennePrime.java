package zadaci_24_08_2016;

import java.math.BigInteger;

public class MersennePrime {

	public static void main(String[] args) {

		// number for testing and counter for count prime numbers
		int num = 2, count = 0;
		System.out.println("p		2^p-1\n");
		do {
			if (isPrime(num)) { // if number is prime write him and he's
								// mersenne form
				System.out.print(num + "		" + new BigInteger("2").pow(num).subtract(BigInteger.ONE));
				System.out.println();
				count++; // increase count of prime numbers by 1
			}
			num++; // increase number that is tested
		} while (count < 100);

	}

	// checks if number is prime
	public static boolean isPrime(int broj) {
		for (int i = 2; i < broj; i++) {
			if (broj % i == 0) {
				return false;
			}
		}
		return true;
	}
}
