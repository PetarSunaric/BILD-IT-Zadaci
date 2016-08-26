package zadaci_25_08_2016;

public class MyString2 {

	// data field
	private char[] chars;

	// constructor
	public MyString2(String s) {
		this.chars = s.toCharArray();
	}

	public MyString2(char[] chars) {
		this.chars = chars;
	}

	// comparing 2 strings
	public int compare(String s) {
		int range = 0;
		// get range from smaller string
		if (this.chars.length > s.length()) {
			range = s.length();
		} else {
			range = this.chars.length;
		}
		// loop to range
		for (int i = 0; i < range; i++) {

			// if characters not equal
			if (chars[i] != s.charAt(i)) {
				// return subtraction of those two
				return (int) (chars[i] - s.charAt(i));
			}
		}
		return this.chars.length - s.length();
	}

	// returns substring with begin as index of begining
	public MyString2 substring(int begin) {
		char[] sub = new char[this.chars.length - begin];
		for (int i = begin; i < this.chars.length; i++) {
			sub[i] = chars[i];
		}
		return new MyString2(sub);
	}

	// returns new string with al upper case
	public MyString2 toUpperCase() {
		char[] toUC = new char[this.chars.length];
		for (int i = 0; i < toUC.length; i++) {
			toUC[i] = Character.toUpperCase(chars[i]);
		}
		return new MyString2(toUC);
	}

	// return string to char
	public char[] toChars() {
		return this.chars;
	}

	// return value of boolean b
	public static MyString2 valueOf(boolean b) {
		if (b == true) {
			return new MyString2("true");
		}
		return new MyString2("false");
	}

}
