package projectNo4;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// getting random word from string
		String[] words = { "programer", "battleship", "crusader", "summer", "challenge", "buisiness", "destination",
				"football", "diamond", "meditation" };
		int r = (int) (Math.random() * 10);
		final String WORD = words[r];

		int countMistake = 0; // counts wrong words
		ArrayList<Character> list = new ArrayList<>(); // list for correct words
		ArrayList<Character> wrongList = new ArrayList<>();// list for wrong
															// words
		while (countMistake < 7) {

			System.out.println("###################################");
			printGame(WORD, countMistake);
			printWord(WORD, list, wrongList);
			System.out.print("\nGuess the letter: ");
			boolean enter = true;
			char letter = 'a';
			while (enter) {
				letter = input.next().charAt(0);
				// after user inputs letter if letter is not in one of 2 lists
				// it will continue
				if (list.contains(letter) || wrongList.contains(letter))
					System.out.print("Allready entered, pick another one: ");
				else
					enter = false;
			}
			if (contains(WORD, letter)) { // if our word contains letter
				list.add(letter); // add him to the list of letters
				printGame(WORD, countMistake);
				printWord(WORD, list, wrongList);
				System.out.println("\n###################################");
				System.out.print("Want to guess a word(1-yes,2-no)? ");
				int answer = input.nextInt();
				if (answer == 1) {
					System.out.println("Your guess is: ");
					String guess = input.next();
					if (guess.equals(WORD)) { // if user enters correct word
												// finish game
						System.out.println("You are correct! Congratulation!");
						System.exit(1);
					}
				}
			} else { // if letter is not correct
				countMistake++; // increase count of mistakes
				wrongList.add(letter); // and add letter to wrong list
			}
			if (countMistake == 6) { // if user have 6 mistakes game is over
				System.out.println("You lost!");
				System.exit(1);
			}
		}
	}

	// checks if word contains character
	public static boolean contains(String word, char ch) {
		for (int i = 0; i < word.length(); i++) {
			if (ch == word.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	// prints word
	public static void printWord(String word, ArrayList<Character> list, ArrayList<Character> wrongList) {
		for (int i = 0; i < word.length(); i++) {
			if (list.contains(word.charAt(i))) // if letter is in list of
												// correct letters
				System.out.print(word.charAt(i) + " "); // print letter
			else
				System.out.print("_ "); // in other case print down slash
		}
		System.out.println();
		if (!wrongList.isEmpty()) { // if list of wrong letters not empty
			System.out.print("\nWrong letters: ");
			for (char e : wrongList) {
				System.out.print(e + " "); // print wrong letters
			}
			System.out.println();
		}
	}

	// prints hangman
	public static void printGame(String word, int count) {
		System.out.println("_________");
		System.out.println("         |\n         |");
		switch (count) {
		case 0:
			System.out.println("\n\n\n");
			break;
		case 1:
			System.out.println("         O\n\n\n");
			break;
		case 2:
			System.out.println("         O");
			System.out.println("         |\n         |\n");
			break;
		case 3:
			System.out.println("         O");
			System.out.print("        \\");
			System.out.println("|\n         |\n");
			break;
		case 4:
			System.out.println("         O");
			System.out.print("        \\");
			System.out.println("|/\n         |\n");
			break;
		case 5:
			System.out.println("         O");
			System.out.print("        \\");
			System.out.println("|/\n         |");
			System.out.println("        /");
			break;
		case 6:
			System.out.println("         O");
			System.out.print("        \\");
			System.out.println("|/\n         |");
			System.out.println("        / \\");
			break;
		}
	}
}
