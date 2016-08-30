package zadaci_29_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// creates array with 100 random values
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.print("Enter index of array: ");
		int index = checkInput();
		System.out.println("Value on that index: " + array[index]);
	}

	// checks input
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 0 || num > 99) // if num is not in range throw
											// exception
					throw new IndexOutOfBoundsException("Not in range");
				// if input is correct stops loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Wrong input, try again:  ");
				input.nextLine();
			} catch (IndexOutOfBoundsException ex) {
				System.out.print("Wrong input, index is out of range, try again:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
