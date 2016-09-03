package zadaci_02_09_2016;

public class GeometricObjectWithTest {

	public static void main(String[] args) {

		// implementation
		GeometricObject geo1 = new Circle(20);
		GeometricObject geo2 = new Circle(15);
		GeometricObject geo3 = new Rectangle(6, 5);
		GeometricObject geo4 = new Rectangle(9, 4);

		// printing
		System.out.println("Max Circle: " + GeometricObject.max(geo1, geo2));
		System.out.print("Max Rectangle: " + GeometricObject.max(geo3, geo4));

	}

}

abstract class GeometricObject implements Comparable<GeometricObject> {

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	// default constructor
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	// constructor that creates object with new values
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	// get method for color
	public String getColor() {
		return color;
	}

	// set method for color
	public void setColor(String color) {
		this.color = color;
	}

	// get method for isFilled
	public boolean isFilled() {
		return filled;
	}

	// set method for isFilled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// get method for dateCreated
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	public abstract double getArea();

	// implemented method compareTo that compares two objects
	public int compareTo(GeometricObject go) {
		if (this.getArea() > go.getArea())
			return 1;
		else if (this.getArea() < go.getArea())
			return -1;
		else
			return 0;
	}

	// method that compares two objects by area and returns bigger one
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		if (o1.compareTo(o2) == 1)
			return o1;
		else
			return o2;
	}

}

class Circle extends GeometricObject {

	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	// get method for radius
	public double getRadius() {
		return radius;
	}

	// set method for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// method that calcualtes area of the circle
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// method that calculates diameter
	public double getDiameter() {
		return 2 * radius;
	}

	// method that calculates perimeter
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	// method that prints data about circle
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}

	public String toString() {
		return "Circle with radius of: " + this.radius;

	}

}

class Rectangle extends GeometricObject {

	private double width;
	private double height;

	// default constructor
	public Rectangle() {
	}

	// constructor that creates object with new values
	public Rectangle(double Width, double Height) {
		this.width = Width;
		this.height = Height;
	}

	// constructor that sets datafields from superclass
	public Rectangle(double Width, double Height, String Color, boolean Filled) {
		this.width = Width;
		this.height = Height;
		setColor(Color);
		setFilled(Filled);
	}

	// get method for width
	public double getWidth() {
		return width;
	}

	// get method for height
	public double getHeight() {
		return height;
	}

	// set method for height
	public void setHeight(double Height) {
		this.height = Height;
	}

	// method that returns area of the rectangle
	public double getArea() {
		return width * height;
	}

	// method that returns perimeter of rectangle
	public double getPerimeter() {
		return 2 * (width + height);
	}

	public String toString() {
		return "Bigger object is recatangle with height " + this.height + " and width " + this.width;
	}

}