package zadaci_23_08_2016;

/*
  	-value: int
	----------
	+MyInteger(value: int)
	+getValue: int
	+isEven(): boolean
	+isOdd(): boolean
	+isPrime(): boolean
	+isEven(value: int): boolean
	+isOdd(value: int): boolean
	+isPrime(value: int): boolean
	+isEven(my): boolean
	+isOdd(): boolean
	+isPrime(): boolean
*/
public class MyIntegerWithTest {

	public static void main(String[] args) {

		// creating instance of MyInteger, set value to 7 and try metods
		MyInteger integer = new MyInteger(7);
		System.out.println("value is " + integer.getValue());
		System.out.println("Num is even? " + integer.isEven());
		System.out.println("Num is odd? " + integer.isOdd());
		System.out.println("Num is prime? " + integer.isPrime());
		System.out.println(MyInteger.parseInt("756"));
		System.out.println("5 is equal to 7? " + integer.equals(5));

		// trying static metods with number
		int num = 12;
		System.out.println(num + " is even? " + MyInteger.isEven(num));
		System.out.println(num + " is odd? " + MyInteger.isOdd(num));
		System.out.println(num + " is prime? " + MyInteger.isPrime(num));

		// creating instance,set value 5 and try static metods using instance
		MyInteger inte = new MyInteger(5);
		System.out.println(inte.getValue() + " is even? " + MyInteger.isEven(inte));
		System.out.println(inte.getValue() + " is odd? " + MyInteger.isOdd(inte));
		System.out.println(inte.getValue() + " is prime? " + MyInteger.isPrime(inte));
		System.out.println(inte.getValue() + " is equal to 7 ?" + inte.equals(integer));
	}

}

class MyInteger {

	// data field
	private int value;

	// constructor that will change value
	MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	// checks if number is even
	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		return false;
	}

	// checks if number is odd
	public boolean isOdd() {
		if (value % 2 == 1) {
			return true;
		}
		return false;
	}

	// checks if number is prime
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	// checks if sent number is even
	public static boolean isEven(int broj) {
		if (broj % 2 == 0)
			return true;
		return false;
	}

	// checks if sent number is odd
	public static boolean isOdd(int broj) {
		if (broj % 2 == 1) {
			return true;
		}
		return false;
	}

	// checks if sent number is prime
	public static boolean isPrime(int broj) {
		for (int i = 2; i < broj; i++) {
			if (broj % i == 0)
				return false;
		}
		return true;
	}

	// checks if sent value of instance is even
	public static boolean isEven(MyInteger object) {
		if (object.getValue() % 2 == 0)
			return true;
		return false;
	}

	// checks if sent value of instance is odd
	public static boolean isOdd(MyInteger object) {
		if (object.getValue() % 2 == 1) {
			return true;
		}
		return false;
	}

	// checks if sent value of instance is prime
	public static boolean isPrime(MyInteger object) {
		for (int i = 2; i < object.getValue(); i++) {
			if (object.getValue() % i == 0)
				return false;
		}
		return true;
	}

	// checks if sent number equal to current number
	public boolean equals(int number) {
		if (value == number)
			return true;
		return false;
	}

	// checks if sent value of instance is equal to current value
	public boolean equals(MyInteger object) {
		if (value == object.value)
			return true;
		return false;
	}

	// convert char to integer
	public static int parseInt(char[] array) {
		String str = new String(array);
		int number = Integer.parseInt(str);
		return number;
	}

	// convert string to integer
	public static int parseInt(String str) {
		int number = Integer.parseInt(str);
		return number;
	}

}