package zadaci_08_08_2016;

import java.util.Scanner;

public class ValidanPassword {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite password: ");
		String str = input.next();
		// provjaravamo da li je password validan
		if (validanPassword(str)) {
			System.out.println("Password je validan");
		} else {
			System.out.println("Password nije validan");
		}

		input.close();
	}

	public static boolean validanPassword(String str) {
		// provjravamo sva tri uslova
		if (str.length() > 7 && samoSlovaIBrojevi(str) && dvaBroja(str)) {
			return true;
		}
		return false;
	}

	// provjerava da li je password samo slova i brojevi
	public static boolean samoSlovaIBrojevi(String str) {
		for (int i = 0; i < str.length(); i++) {
			// ako karakter nije slovo ili broj vraca false, u suprotom vraca
			// true
			if (!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)))
				return false;
		}
		return true;
	}

	public static boolean dvaBroja(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			// ako je karakter broj povecava broj brojeva
			if (Character.isDigit(str.charAt(i)))
				count++;
		}
		// ako je broj brojeva bar 2 vraca true;
		if (count > 1) {
			return true;
		}
		return false;
	}
}
