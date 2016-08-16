package zadaci_16_08_2016;

import java.util.Scanner;

public class DuzinaIPrvoSlovoStringa {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String str = input.nextLine();
		// duzinu stringa odredjujemo ovako.
		System.out.print("Duzina stringa je " + str.length());
		for (int i = 0; i < str.length(); i++) {
			// ispisi prvo slovo na koje naidje i prekini petlju
			if (Character.isLetter(str.charAt(i))) {
				System.out.println(" a prvo slovo je " + str.charAt(i));
				break;
			}
		}
		input.close();
	}

}
