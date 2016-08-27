package zadaci_26_08_2016;

import java.util.Scanner;

public class TringleWithTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// inputing 3 sides
		System.out.println("Enter 3 sides of triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		// making instance of triangle
		Triangle tr = new Triangle(side1, side2, side3);

		System.out.println("Enter color for triangle: ");
		String color = input.next();
		tr.setColor(color); // sets color to entered one

		System.out.println("Is triangle filled(yes or no): ");
		String filled = input.next(); // filling triangle
		if (filled.equals("yes"))
			tr.setfilled(true);
		else
			tr.setfilled(false);

		// printing results
		System.out.println("Area is: " + tr.getArea() + ", perimeter is: " + tr.getPerimeter() + ", color is: "
				+ tr.getColor() + " and triangle is filled? " + tr.isfilled());
		input.close();
	}

}

class Triangle extends GeometricObject {
	/*
	 -side1: double
	 -side2: double
	 -side3: double
	 ---------------
	 +Triangle()
	 +Triangle(side1: double, side2: double, side3: double)
	 +gerArea(): double
	 +getPerimeter(): double
	 +toString(): String 
	 */

	private double side1 = 1; // data fields
	private double side2 = 1;
	private double side3 = 1;

	Triangle() { // no-args constructor
	}

	// constructor with new sides
	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() { // getting area of triangle
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public double getPerimeter() { // getting perimeter of triangle
		return side1 + side2 + side3;
	}

	public String toString() {
		return super.toString() + "Tirangle: side1=" + side1 + ",side2=" + side2 + ",side3=" + side3;
	}
}

// geometric object class
class GeometricObject {

	/*
	 -color: String
	 -dateCreated: Date
	 -filled: boolean
	 -------------------
	 +GeometricObject()
	 +GeometricObject(color: String)
	 +getColor()
	 +setColor(color: String)
	 +isFilled(): boolean
	 +setFilled(): void
	 +toString(): String
	 */
	// data fields
	private String color = "white";
	private java.util.Date dateCreated;
	private boolean filed;

	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	public GeometricObject(String color) {
		dateCreated = new java.util.Date();
		this.color = color;
	}

	@Override
	public String toString() {
		return "color is " + color + "\ndateCreated is " + dateCreated;
	}

	public boolean isfilled() { // checks if geometric object is filled
		return this.filed;
	}

	public void setfilled(boolean fill) { // setting filled or not
		if (fill)
			this.filed = true;
		else
			this.filed = false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDate() {
		return dateCreated.toString();
	}
}
