package zadaci_10_08_2016;

import java.util.Scanner;

public class KolikoSePutaKarakterPonovio {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		// unosimo string
		String str = input.nextLine();
		System.out.print("Unesite karakter: ");
		// unosimo karakter
		String str2 = input.next();
		char ch = str2.charAt(0);
		// prosledjujemo string i karakter metodi
		System.out.println("Karakter " + ch + " se ponovio " + count(str, ch) + " puta");
		input.close();
	}

	// vraca broj ponavljvanja karaktera u stringu
	public static int count(String str, char a) {
		// brojac ponavljanja
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			// ako je trenutni karakter jednak proslijdjenom povecaj brojac
			if (str.charAt(i) == a) {
				count++;
			}
		}
		return count;
	}

}
