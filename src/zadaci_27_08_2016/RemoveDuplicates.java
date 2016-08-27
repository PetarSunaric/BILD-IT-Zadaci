package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RemoveDuplicates {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// creates list with 10 numbers that user inputs
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter number: ");
			int num = checkInput();
			list.add(num);
		}
		removeDuplicate(list);

		// print list
		System.out.println("The distinct integers are: ");
		for (int e : list) {
			System.out.print(e + " ");
		}
	}

	// removes duplicates from list
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) // if there is 2 same elements
												// in list
					list.remove(j); // delete one
			}
		}
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
