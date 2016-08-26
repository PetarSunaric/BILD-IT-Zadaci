package zadaci_25_08_2016;

public class MyStringBuilder1 {

	private String str; // data field that stores string

	// constructor with new string as argument
	public MyStringBuilder1(String s) {
		this.str = s;
	}

	// method that add new string to current
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		return new MyStringBuilder1(this.str + s);
	}

	// method that add number to current string
	public MyStringBuilder1 append(int i) {
		return new MyStringBuilder1(this.str + i);
	}

	// return length of string
	public int length() {
		return this.str.length();
	}

	// return character at specific index
	public char charAt(int index) {
		return str.charAt(index);
	}

	// returns string with all lower case
	public MyStringBuilder1 toLowerCase() {
		return new MyStringBuilder1(str.toLowerCase());
	}

	// return specific part of the string
	public MyStringBuilder1 substring(int begin, int end) {
		return new MyStringBuilder1(str.substring(begin, end));
	}

	@Override
	public String toString() {
		return this.str;
	}
}
