package zadaci_22_08_2016;
/*
 SLOW: int:1
 MEDIUM: int:2
 FAST: int:3
 -speed: int
 -on: boolean
 -radius: double
 -color: String
 ---------------
 +Fan()
 +toString(): String
 */

public class FanClassAndTest {

	public static void main(String[] args) {

		// making Fan instance and setting data
		Fan fan = new Fan();
		fan.setSpeed(fan.FAST);
		fan.setRadius(10);
		fan.setColor("yellow");
		fan.setOn(true);
		// making second instance of Fan and setting date
		Fan naf = new Fan();
		naf.setSpeed(fan.MEDIUM);
		naf.setRadius(5);
		naf.setColor("blue");
		naf.setOn(false);
		System.out.println(fan.toString());
		System.out.println(naf.toString());

	}

}

class Fan {
	// data fields
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = SLOW;
	private boolean on;
	private double radius = 5;
	private String color = "blue";

	// no-arg constructor
	Fan() {

	}

	// returns fan speed as string
	public String getSpeed() {
		if (this.speed == 1)
			return "SLOW";
		else if (this.speed == 2)
			return "MEDIUM";

		return "FAST";
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		if (isOn()) // returns string depends on if fan is on or off
			return "Fan speed is: " + getSpeed() + ", color is: " + getColor() + ", and radius is: " + getRadius();
		return "Fan color is: " + getColor() + ", radius is: " + getRadius() + ", and fan is off.";

	}

}