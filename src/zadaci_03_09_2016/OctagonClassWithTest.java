package zadaci_03_09_2016;

public class OctagonClassWithTest {

	public static void main(String[] args) {

		// first octagon object
		Octagon o1 = new Octagon(5);
		// area of octagon
		System.out.printf("%3.2f\n",o1.getArea());
		// perimeter of octagon
		System.out.println(o1.getPerimeter());
		// second octagon object
		Octagon o2 = new Octagon();
		// we assign value to second object of the first one(cloned)
		o2 = o1.clone();
		// printing out result of compare method
		if (o1.compareTo(o2) > 0)
			System.out.println("First octagon is bigger");
		else if (o1.compareTo(o2) < 0)
			System.out.println("Second octagon is bigger");
		else
			System.out.println("Octagons are equal");

	}

}

class Octagon extends GeometricObject implements Cloneable, Comparable<GeometricObject> {
	// only 1 side data field since we assume they're equal
	private double side;

	// default constructor
	public Octagon() {

	}

	// constructor that creates Octagon object with new side value
	public Octagon(double side) {
		this.side = side;

	}

	@Override
	// method that calculates area of the octagon
	public double getArea() {
		return (2 + (4 / Math.sqrt(2)) * side * side);
	}

	// method that calculates perimeter of octagon
	public double getPerimeter() {
		return 8 * side;
	}

	// overriden clone method that returns new octagon object which is clone of
	// original one
	public Octagon clone() {
		Octagon clone = new Octagon(this.side);
		return clone;
	}

	// compare method that uses area to compare which object is bigger
	public int compareTo(Octagon o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;

	}

}
