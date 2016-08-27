package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// creates list with 5 numbers that user inputs
		ArrayList<Double> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number: ");
			double num = checkInput();
			list.add(num);
		}
		System.out.println("Sum is: " + sum(list));

	}

	// returns sum of a list
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i); // adds every element to sum of elements before
		}
		return sum;
	}

	// checks input
	public static double checkInput() {

		double num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextDouble();
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
