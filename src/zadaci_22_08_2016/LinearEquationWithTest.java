package zadaci_22_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 -a: double 
 -b: double 
 -c: double 
 -d: double 
 -e: double 
 -f: double 
 --------------
 +LinearEquation(a: double, b: double, c: double, d: double, e: double, f: double)
 +isSolvable(): boolean
 +getX(): double
 +getY(): double     
 */
public class LinearEquationWithTest {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// enter datas
		System.out.print("Enter a: ");
		double a = checkInput();
		System.out.print("Enter b: ");
		double b = checkInput();
		System.out.print("Enter c: ");
		double c = checkInput();
		System.out.print("Enter d: ");
		double d = checkInput();
		System.out.print("Enter e: ");
		double e = checkInput();
		System.out.print("Enter f: ");
		double f = checkInput();
		// making instance of class
		LinearEquation le = new LinearEquation(a, b, c, d, e, f);
		// if it is not solvable write there is no solution
		if (!le.isSolvable()) {
			System.out.println("The equation has no solution.");
			// else write x and y
		} else {
			System.out.printf("X is: %2.2f and Y is: %2.2f", le.getX(), le.getY());
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

class LinearEquation {

	// data fields
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	// constructor
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	// checks if it is solvable
	public boolean isSolvable() {
		if (a * d - b * c != 0)
			return true;
		return false;
	}

	// returns value of x
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	// returns value of y
	public double getY() {
		return (a * d - e * c) / (a * d - b * c);
	}
}