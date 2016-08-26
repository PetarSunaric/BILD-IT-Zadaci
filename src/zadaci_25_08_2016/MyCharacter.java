package zadaci_25_08_2016;

public class MyCharacter {

		//data fields
		public final int MAX_VALUE = 65535;
		public final int MIN_VALUE = 0;
		private char ch;
		
		MyCharacter() {
			this(0);
		}
		MyCharacter(int n) {
			// if wrong value for char print message
			if (n >= MIN_VALUE && n <= MAX_VALUE) {
				this.ch = (char)(n);
			} else {
				System.out.println("Error: int value for char is wrong.");
			}
		}
		MyCharacter(char c) {
			this.ch = c;
		}
		public char getValue() {
			return this.ch;
		}
		//checks if 2 characters are equal
		public boolean equals(MyCharacter ch) {
			if(this.ch==ch.getValue())
				return true;
			return false;
		}
		//checks if character is letter
		public boolean isLetter(MyCharacter c){
			if((c.getValue()>64&&c.getValue()<91)||(c.getValue()>96&&c.getValue()<123))
				return true;
			return false;
		}
		//checks if character is digit
		public boolean isDigit(MyCharacter c){
			if(c.getValue()>47&&c.getValue()<58)
				return true;
			return false;
		}
		//compares 2 characters
		public int compareTo(char ch) {
			return this.ch - ch;
		}
}
