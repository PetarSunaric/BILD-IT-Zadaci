package zadaci_22_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntersectingPoints {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// entering x's and y's
		System.out.print("Enter x1: ");
		double x1 = checkInput();
		System.out.print("Enter y1: ");
		double y1 = checkInput();
		System.out.print("Enter x2: ");
		double x2 = checkInput();
		System.out.print("Enter y2: ");
		double y2 = checkInput();
		System.out.print("Enter x3: ");
		double x3 = checkInput();
		System.out.print("Enter y3: ");
		double y3 = checkInput();
		System.out.print("Enter x4: ");
		double x4 = checkInput();
		System.out.print("Enter y4: ");
		double y4 = checkInput();

		// transforming x's and y's to a,b,c,d,e and f
		double a = y1 - y2;
		double b = x2 - x1;
		double c = y3 - y4;
		double d = x4 - x3;
		double e = (y1 - y2) * x1 - ((x1 - x2) * y1);
		double f = (y3 - y4) * x3 - ((x3 - x4) * y3);

		// making instance of class LinearEquation
		LinearEquation le = new LinearEquation(a, b, c, d, e, f);
		// writes solution
		if (!le.isSolvable()) {
			System.out.println("The two lines are parallel");
		} else {
			System.out.printf("The intersecting point is at: (%2.3f,%2.3f)", le.getX(), le.getY());
		}
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
				System.out.print("Pogresan unos, unesite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
