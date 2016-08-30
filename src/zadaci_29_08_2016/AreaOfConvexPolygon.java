package zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfConvexPolygon {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Double> listX = new ArrayList<>();
		ArrayList<Double> listY = new ArrayList<>();
		System.out.print("Enter the number of the points: ");
		int n = checkInput();
		System.out.println("Enter the coordinates of the points: ");
		for (int i = 1; i <= n; i++) {
			listX.add(checkInputD()); // adds x of coordinate
			listY.add(checkInputD()); // adds y of coordinate
		}
		System.out.println("The total area is: " + getArea(listX, listY));
	}

	// returns area of polygon
	public static double getArea(ArrayList<Double> listX, ArrayList<Double> listY) {
		double help1 = 0, help2 = 0;
		for (int i = 0; i < listX.size(); i++) {
			if (i != listX.size() - 1) {
				help1 += listX.get(i) * listY.get(i + 1);// sums numbers until
															// last
				help2 += listX.get(i + 1) * listY.get(i);// x and y
			} else {
				help1 += listX.get(i) * listY.get(0);// adds last x and y
				help2 += listX.get(0) * listY.get(i);// to sums
			}
		}
		return (help2 - help1) / 2;
	}

	// checks input for integers
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 3)
					throw new InputMismatchException();
				// if input is correct stops loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Wrong input, try again:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}

	// checks input for decimal
	public static double checkInputD() {

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
