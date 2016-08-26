package zadaci_25_08_2016;

public class MyString1 {

	private char[] chars; // data field for storing values of the string

	public MyString1(char[] chars) { // constructor for MyString1
		this.chars = chars;
	}

	public char charAt(int index) { // returns character at specific index
		return this.chars[index];
	}

	public int length() { // returns length of string
		return this.chars.length;
	}

	// returns part of string from begin until end
	public MyString1 substring(int begin, int end) {
		char[] sub = new char[end - begin];
		for (int i = begin; i < end; i++) {
			sub[i] = chars[i];
		}
		return new MyString1(sub);
	}

	// returns string with all lower cases
	public MyString1 toLowerCase() {
		char[] toLC = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			toLC[i] = Character.toLowerCase(chars[i]);
		}
		return new MyString1(toLC);
	}

	// check if two strings are equals
	public boolean equals(MyString1 s) {
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != s.charAt(i))
				return false;
		}
		return true;
	}

	// returns integer value as a string
	public static MyString1 valueOf(int i) {
		return new MyString1(new char[] { (char) i });
	}
}
