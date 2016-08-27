package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CombineTwoLists {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.print("Enter 5 numbers of list1: ");
		for (int i = 0; i < 5; i++) {
			int num = checkInput();
			list1.add(num);
		}
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.print("Enter 5 numbers of list2: ");
		for (int i = 0; i < 5; i++) {
			int num = checkInput();
			list2.add(num);
		}
		// new list that is combine of two other lists
		ArrayList<Integer> list = union(list1, list2);

		// print list
		System.out.println("Numbers in increasing order: ");
		for (int e : list) {
			System.out.print(e + " ");
		}
	}

	// combines two lists
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(list1);
		list.addAll(list2);
		return list;
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
