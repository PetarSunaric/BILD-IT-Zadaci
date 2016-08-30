package zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PerfectSquare {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter an integer m: ");
		int m = checkInput(); // inputs m
		System.out.println(
				"The smallest number n for m * n to be a perfect square is " + getN(m) + "\nm*n is " + m * getN(m));
	}

	// returns n
	public static int getN(int m) {
		ArrayList<Integer> list = new ArrayList<>();// array list for factors
		int i = 2; // number to check
		while (m != 1) {
			if (m % i == 0) { // gets smallest factors
				list.add(i);
				m /= i;
			} else
				i++;
		}
		int pom = 1, count = 0;
		// multiply numbers that shows odd times
		for (int j = 0; j < list.size(); j++) {
			count = 0;
			for (int k = 0; k < list.size(); k++) {
				if (list.get(j) == list.get(k)) {
					count++;
				}
			}
			// if number shows odd times multiply him
			if (count % 2 == 1)
				pom *= list.get(j);

		}
		return pom;

	}

	// checks input
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				// if input is correct stops loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Wrong input, try again:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
