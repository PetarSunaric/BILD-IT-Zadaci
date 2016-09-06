package zadaci_05_09_2016;

import java.util.Scanner;

public class ConvertDecimalToFractions {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		String s = input.next();
		// prints decimal number as fractional number
		System.out.println("The fractional number is " + new BigRational(s));
		input.close();
	}

}
