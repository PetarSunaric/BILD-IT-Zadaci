package zadaci_02_09_2016;

public class ComparableCircleWithTest {

	public static void main(String[] args) {
		ComparableCircle com1 = new ComparableCircle(); // creating first
														// instance
		com1.setRadius(27);
		ComparableCircle com2 = new ComparableCircle(); // creating second
														// instance
		com2.setRadius(26);

		// result
		System.out.print("Larger of two circles is: ");
		if (com1.compareTo(com2) == 1) {
			System.out.print("Circle 1");
		} else if (com1.compareTo(com2) == -1) {
			System.out.println("Circle 2");
		} else if (com1.compareTo(com2) == 0)
			System.out.println("They are equal!");

	}

}

class ComparableCircle extends Circle2 implements Comparable<ComparableCircle> {
	// default constructor that sets radius to 1
	public ComparableCircle() {
		super(1);
	}

	// constructor that creates object with set radius
	public ComparableCircle(double radius) {
		super(radius);
	}

	// overriden compareTO method

	public int compareTo(ComparableCircle o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
}

/**
 * Class circle that contains radius data field and methods related to circle
 */
class Circle2 {
	private double radius;

	// default constructor
	public Circle2() {
	}

	// constructor that creates object with set radius
	public Circle2(double radius) {
		this.radius = radius;

	}

	// get method for radius
	public double getRadius() {
		return radius;
	}

	// set method for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * method that calculates area of the circle
	 * 
	 * @return - area of the circle as double
	 */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/**
	 * method that calculates perimeter of the circle
	 * 
	 * @return - perimeter value as a double
	 */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public String toString() {
		return "Circle with radius of: " + this.radius;

	}
}