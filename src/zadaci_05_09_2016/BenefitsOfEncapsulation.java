package zadaci_05_09_2016;

public class BenefitsOfEncapsulation {

	public static void main(String[] args) {

		// creating first rational number
		Rational r1 = new Rational(2, 5);
		// creating second rational number
		Rational r2 = new Rational(5, 4);
		// testing addition method
		System.out.println(r1.add(r2));
		// testing subtraction method
		System.out.println(r1.subtract(r2));
		// testing multiplication method
		System.out.println(r1.multiply(r2));
		// testing division method
		System.out.println(r1.divide(r2));
	}
}

class Rational extends Number implements Comparable<Rational> {
	
	private static final long serialVersionUID = 1L;
	// Data fields for numerator and denominator
	private long[] r = new long[2];
	private static int NUMERATOR = 0;
	private static int DENOMINATOR = 1;

	/** Default constructor */
	public Rational() {
		this(0, 1);
	}

	/** Construct a rational with specified numerator and denominator */
	public Rational(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		r[NUMERATOR] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		r[DENOMINATOR] = Math.abs(denominator) / gcd;
	}

	/** Find GCD of two numbers */
	private long gcd(long n, long d) {
		long t1 = Math.abs(n);
		long t2 = Math.abs(d);
		long remainder = t1 % t2;

		while (remainder != 0) {
			t1 = t2;
			t2 = remainder;
			remainder = t1 % t2;
		}

		return t2;
	}

	/** Return numerator */
	public long getNumerator() {
		return r[NUMERATOR];
	}

	/** Return denominator */
	public long getDenominator() {
		return r[DENOMINATOR];
	}

	/** Add a rational number to this rational */
	public Rational add(Rational secondRational) {
		long n = r[NUMERATOR] * secondRational.getDenominator() + r[DENOMINATOR] * secondRational.getNumerator();
		long d = r[DENOMINATOR] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	/** Subtract a rational number from this rational */
	public Rational subtract(Rational secondRational) {
		long n = r[NUMERATOR] * secondRational.getDenominator() - r[DENOMINATOR] * secondRational.getNumerator();
		long d = r[DENOMINATOR] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	/** Multiply a rational number to this rational */
	public Rational multiply(Rational secondRational) {
		long n = r[NUMERATOR] * secondRational.getNumerator();
		long d = r[DENOMINATOR] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	/** Divide a rational number from this rational */
	public Rational divide(Rational secondRational) {
		long n = r[NUMERATOR] * secondRational.getDenominator();
		long d = r[DENOMINATOR] * secondRational.r[NUMERATOR];
		return new Rational(n, d);
	}

	@Override
	public String toString() {
		if (r[DENOMINATOR] == 1)
			return r[NUMERATOR] + "";
		else
			return r[NUMERATOR] + "/" + r[DENOMINATOR];
	}

	/** Override the equals method in the Object class */
	public boolean equals(Object parm1) {
		return (this.subtract((Rational) (parm1))).getNumerator() == 0;
	}

	/** Override the hashCode method in the Object class */
	public int hashCode() {
		return new Double(this.doubleValue()).hashCode();
	}

	/** Override the abstract intValue method in java.lang.Number */
	public int intValue() {
		return (int) doubleValue();
	}

	/** Override the abstract floatValue method in java.lang.Number */
	public float floatValue() {
		return (float) doubleValue();
	}

	/** Override the doubleValue method in java.lang.Number */
	public double doubleValue() {
		return r[NUMERATOR] * 1.0 / r[DENOMINATOR];
	}

	/** Override the abstract longValue method in java.lang.Number */
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	public int compareTo(Rational o) {
		if ((this.subtract(o)).getNumerator() > 0)
			return 1;
		else if ((this.subtract(o)).getNumerator() < 0)
			return -1;
		else
			return 0;
	}
}