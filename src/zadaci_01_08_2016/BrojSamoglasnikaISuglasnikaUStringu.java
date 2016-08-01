package zadaci_01_08_2016;

import java.util.Scanner;

public class BrojSamoglasnikaISuglasnikaUStringu {

	public static boolean jeSamoglasnik(char ch) {
		// pretvaramo karakter u veliko slovo radi lakseg rukovanja i ako je
		// jedan od samoglasnika vraca true ako nije vraca false.
		char slovo = Character.toUpperCase(ch);
		if (slovo == 'A' || slovo == 'E' || slovo == 'I' || slovo == 'O' || slovo == 'U')
			return true;
		return false;
	}

	public static int suglasnici(String str) {
		int count = 0;
		// uzimamo string i prolazimo kroz njega provjeravajuci da li je dati
		// karakter slovo i da li je suglasnik
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)) && !jeSamoglasnik(str.charAt(i))) {
				// ako jeste povecavamo count suglasnika
				count++;
			}
		}
		// i na kraju vracamo vrijednost
		return count;
	}

	public static int samoglasnici(String str) {
		int count = 0;
		// uzimamo string i prolazimo kroz njega provjeravajuci da li je dati
		// karakter samoglasnik pozivajuci metodu jeSamoglasnik
		for (int i = 0; i < str.length(); i++) {
			if (jeSamoglasnik(str.charAt(i)))
				// ako jeste povecavamo count samoglasnika
				count++;

		}
		// i vracamo vrijednost
		return count;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// trazimo od korisnika da unese string
		System.out.println("Unesite string: ");
		String str = input.nextLine();
		// ispisujemo broj suglasnika
		System.out.println("Broj suglasnika: " + suglasnici(str));
		// ispisujemo broj samoglasnika
		System.out.println("Broj samoglasnika: " + samoglasnici(str));
		input.close();

	}

}
