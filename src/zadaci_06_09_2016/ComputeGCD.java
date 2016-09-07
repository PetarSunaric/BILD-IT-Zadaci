package zadaci_06_09_2016;

import java.util.Scanner;

public class ComputeGCD {

	public static void main(String[] args) {

		System.out.print("Enter two integers: ");
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt(); // inputs 2 number
		int n2 = input.nextInt();

		System.out.println("The GCD is " + gcd(n1, n2));
		input.close();
	}

	// finding greatest common divisor
	private static int gcd(int n1, int n2) {
		if (n1 % n2 == 0)
			return n2;
		else
			return gcd(n2, n1 % n2); // method that calls itself(recursion)
	}

}
