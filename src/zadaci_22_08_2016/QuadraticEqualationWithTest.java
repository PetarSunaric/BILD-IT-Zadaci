package zadaci_22_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 -a: double
 -b: double
 -c: double
 ---------------
 +QuadraticEqualation(a: double, b: double, c: double)
 +getDiscriminant(): double
 +getRoot1(): double
 +getRoot2(): double
 */
public class QuadraticEqualationWithTest {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// entering a,b and c
		System.out.print("Enter a: ");
		double a = checkInput();
		System.out.print("Enter b: ");
		double b = checkInput();
		System.out.print("Enter c: ");
		double c = checkInput();
		// making instance of class
		QuadraticEquation qe = new QuadraticEquation(a, b, c);
		if (qe.getDiscriminant() == 0) { // if discriminant is 0 only one root
			System.out.printf("There is one root and it has value of %2.3f", qe.getRoot1());
		} else if (qe.getDiscriminant() > 0) { // two roots if it is positive
			System.out.printf("There is 2 roots, first root: %2.3f, second root: %2.3f", qe.getRoot1(), qe.getRoot2());
		} else // otherwise it has no roots
			System.out.println("The equation has no roots.");
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

class QuadraticEquation {

	// data fields
	private double a;
	private double b;
	private double c;

	// constructor
	public QuadraticEquation(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// getters
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	// returns discriminant
	public double getDiscriminant() {
		return (b * b) - (4 * a * c);
	}

	// return root1 if discriminant is more or equal to 0
	public double getRoot1() {
		if (getDiscriminant() < 0)
			return 0;
		return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
	}

	// return root2 if discriminant is more or equal to 0
	public double getRoot2() {
		if (getDiscriminant() < 0)
			return 0;
		return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
	}
}