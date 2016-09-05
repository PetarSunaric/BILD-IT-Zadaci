package zadaci_03_09_2016;

public class SumTheAreasOfGeometricObject {

	public static void main(String[] args) {
		// creating 4 objects
		GeometricObject[] list = { new Circle(), new Circle(5.2), new Rectangle(3, 5), new Rectangle(5, 4) };

		// gets total area
		System.out.printf("Total area: %3.2f", sumArea(list));

	}

	// gets sum of the areas
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (GeometricObject geoObj : a)
			sum += geoObj.getArea();

		return sum;
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
