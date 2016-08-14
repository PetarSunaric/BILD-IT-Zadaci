package crapsAndCreditCards;

public class Craps {

	public static void main(String[] args) {

		int roll = rollDices();
		// after first roll if we got 2,3 or 12 write "You lose"
		if (roll == 2 || roll == 3 || roll == 12) {
			System.out.println("You lose");
			// if we got 7 or 11 write "You win"
		} else if (roll == 7 || roll == 11) {
			System.out.println("You win");
			// otherwise
		} else {
			System.out.println("point is " + roll);
			// loop until we win or lose
			boolean contiueRoll = true;
			while (contiueRoll) {
				// roll again
				int secondRoll = rollDices();
				// it second roll is 7 we lose
				if (secondRoll == 7) {
					System.out.println("You lose");
					// ends loop
					contiueRoll = false;
					// if we get same number we win and end loop
				} else if (secondRoll == roll) {
					System.out.println("You win");
					contiueRoll = false;
				}
			}
		}
	}

	public static int rollDices() {
		// random 2 numbers
		int num1 = (int) (1 + Math.random() * 7);
		int num2 = (int) (1 + Math.random() * 7);
		System.out.println("You rolled " + num1 + "+" + num2 + "=" + (num1 + num2));
		// and return sum of them
		return (num1 + num2);
	}

}
