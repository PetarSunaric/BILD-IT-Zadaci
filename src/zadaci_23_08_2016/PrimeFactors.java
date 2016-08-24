package zadaci_23_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFactors {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter number: ");
		int num = checkInput();
		// making instance for stacking integers
		StackOfIntegers stack = new StackOfIntegers();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) { // if num can be divided by i
				stack.push(i); // push i to list
				num /= i; // num becomes remaning number
				i = 1; // and return loop to start
			}
		}
		stack.push(num); // stack remaining number to list
		while (!stack.empty()) // print until list isn't empty
			System.out.print(stack.pop() + " ");
	}

	// checks input
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 1)
					throw new InputMismatchException("Not positive");
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
