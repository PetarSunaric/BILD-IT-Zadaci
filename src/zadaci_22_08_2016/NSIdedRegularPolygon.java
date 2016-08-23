package zadaci_22_08_2016;

/*
 -n: int
 -side: double
 -x: double
 -y: double
 ------------
 +RegularPolygon()
 +RegularPolygon(n: int, side: double)
 +RegularPolygon(n: int, side: double, x: double, y: double)
 +getPerimeter()
 +getArea()
 */
public class NSIdedRegularPolygon {

	public static void main(String[] args) {

		// making 3 instances of RegularPolygon class and printing data
		RegularPolygon rp = new RegularPolygon();
		System.out.printf("Perimeter is: %1.2f and area is: %3.2f\n", rp.getPerimeter(), rp.getArea());
		RegularPolygon rp2 = new RegularPolygon(6, 4);
		System.out.printf("Perimeter is: %1.2f and area is: %3.2f\n", rp2.getPerimeter(), rp2.getArea());
		RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.printf("Perimeter is: %1.2f and area is: %3.2f\n", rp3.getPerimeter(), rp3.getArea());
	}

}

class RegularPolygon {

	// data fields
	private int n = 3;
	private double side = 1;
	private double x;
	private double y;

	// no-arg constructor
	RegularPolygon() {

	}

	// constructor for (0,0) position
	public RegularPolygon(int n, double side) {
		super();
		this.n = n;
		this.side = side;
	}

	// constructor for specific position
	public RegularPolygon(int n, double side, double x, double y) {
		super();
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getPerimeter() {
		return getSide() * getN();
	}

	public double getArea() {
		return (getN() * (Math.pow(getSide(), 2))) / (4 * (Math.tan(Math.PI / getN())));
	}
}