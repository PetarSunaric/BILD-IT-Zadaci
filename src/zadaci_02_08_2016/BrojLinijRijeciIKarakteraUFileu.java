package zadaci_02_08_2016;
/*Napišite program koji æe brojati broj karaktera, rijeèi i linija teksta u nekom fileu.
 *  Rijeèi trebaju biti odvojene jednim spaceom. Ime file proslijediti kao argument u vaš program.*/

//import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BrojLinijRijeciIKarakteraUFileu {

	public static void main(String[] args) throws IOException {

		Scanner input2 = new Scanner(System.in);
		// trazimo od korisnika da unese fajl
		System.out.println("Unesite ime fajla sa putanjom: ");
		String imeFajla = input2.next();
		// uzimamo fajl
		File file = new File(imeFajla);
		Scanner input = new Scanner(file);
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
