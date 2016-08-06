package zadaci_06_08_2016;

import java.util.Scanner;

public class KarakteriNaNeparnimPozicijama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		// unosimo string
		String str = input.nextLine();
		// parni indexi su neparna mjesta u stringu
		for (int i = 0; i < str.length(); i++) {
			// ako index paran ispisace slovo
			if (i % 2 == 0) {
				System.out.print(str.charAt(i));
			}
		}
		input.close();
	}

}
