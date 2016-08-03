package zadaci_02_08_2016;
/*Napišite program koji æe brojati broj karaktera, rijeèi i linija teksta u nekom fileu.
 *  Rijeèi trebaju biti odvojene jednim spaceom. Ime file proslijediti kao argument u vaš program.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BrojLinijRijeciIKarakteraUFileu {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input2 = new Scanner(System.in);
		// trazimo od korisnika da unese fajl
		String imeFajla = null;
		boolean greska = true;
		Scanner input = new Scanner(System.in);
		// petlja se vrti sve dok postoji greska
		while (greska) {
			try {
				System.out.println("Unesite ime fajla sa putanjom: ");
				imeFajla = input2.nextLine();
				// uzimamo fajl
				input = new Scanner(new File(imeFajla));
				// kada je unijeta tacna putanja petlja se prekida
				greska = false;
			} catch (FileNotFoundException ex) {
				System.out.println("Pogresna putanja!");

			}
		}
		int brojKaraktera = 0, brojRijeci = 0, brojLinija = 0;
		// pravimo niz gdje cemo smjestiti rijeci
		String[] niz = {};
		while (input.hasNext()) {
			// uzimamo liniju koda
			String str = input.nextLine();
			// broj karaktera je duzina stringa
			brojKaraktera += str.length();
			// broj linija se povecava sa svakim uzimanjem linije
			brojLinija++;
			// splitujemo liniju u rijeci kako bismo dobili broj rijeci
			niz = str.split(" ");
			brojRijeci += niz.length;
		}
		input2.close();
		input.close();
		// ispisujemo broj karaktera, broj rijeci i broj linija u fajlu
		System.out.println(
				"Broj karaktera: " + brojKaraktera + ", broj rijeci: " + brojRijeci + ",broj linija: " + brojLinija);
	}

}
