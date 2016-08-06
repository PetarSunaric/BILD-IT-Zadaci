package zadaci_05_08_2016;

import java.util.Scanner;

public class BrojenjeSlovaUStringu {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite string: ");
		String str = input.nextLine();
		// uneseni string prosledjujemo metodi
		System.out.println("Ukupno slova u stringu: " + countLetters(str));
		input.close();
	}
	public static int countLetters(String str) {
		// pravimo brojac slova
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			// ako je karakter slovo povecavamo count za 1
			if (Character.isLetter(str.charAt(i)))
				count++;
		}
		// vracamo brojac slova
		return count;
	}


}
