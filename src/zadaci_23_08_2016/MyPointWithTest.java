package zadaci_23_08_2016;

public class MyPointWithTest {

	/*
	 * -x: double -y: double ------------ +MyPoint() +MyPoint(x: double, y:
	 * double) +distance(object: MyPoint): double +distance(x: double, y:
	 * double)
	 * 
	 */
	public static void main(String[] args) {

		// creating 2 instances of MyPoint that will store different values
		MyPoint mp = new MyPoint();
		MyPoint mp2 = new MyPoint(10, 30.5);

		// gets the distance
		System.out.println("Distance is: " + mp.distance(mp2));

	}

}

class MyPoint {

	// data fields
	private double x;
	private double y;

	MyPoint() {

	}

	// constructor
	public MyPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	// getters
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// returns distance between current dots and dots stored in object
	public double distance(MyPoint object) {
		return Math.sqrt((Math.pow(object.getX() - this.x, 2)) + (Math.pow(object.getY() - this.y, 2)));
	}

	// returns distance between current dots and new dots
	public double distance(double x, double y) {
		return Math.sqrt((Math.pow(x - this.x, 2)) + (Math.pow(y - this.y, 2)));
	}
}