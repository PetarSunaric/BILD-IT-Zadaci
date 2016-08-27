package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sort {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// creates list with 5 numbers that user inputs
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number: ");
			int num = checkInput();
			list.add(num);
		}
		sort(list);

		// print list
		System.out.println("Numbers in increasing order: ");
		for (int e : list) {
			System.out.print(e + " ");
		}
	}

	// sorting list
	public static void sort(ArrayList<Integer> list) {

		for (int i = 0; i < list.size() - 1; i++) {
			int min = list.get(i); // setting start element as minumum
			int minIndex = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (min > list.get(j)) { // if finds element smaller than min
					min = list.get(j); // that element becomes min
					minIndex = j; // and min index becomes current index
				}
			}
			if (minIndex != i) { // in case that current minIndex not i
				list.set(minIndex, list.get(i));// swaps elements
				list.set(i, min);
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
