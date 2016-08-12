package zadaci_11_08_2016;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class TrenutniDatumIVrijeme {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Trenutni datum i vrijeme: " + getCurrentDate() + " " + getCurrentTime());

	}

	// dobijamo trenutno vrijeme
	public static String getCurrentTime() {
		long ukupnoSekundi = System.currentTimeMillis() / 1000;
		long sekundi = ukupnoSekundi % 60;
		long minuta = ukupnoSekundi / 60 % 60;
		// +2 je da bi izravnali vremenske zone
		long sati = ((ukupnoSekundi / 3600) + 2) % 24;
		return sati + ":" + minuta + ":" + sekundi;
	}

	// dobijamo trenutni datum
	public static String getCurrentDate() {
		GregorianCalendar gc = new GregorianCalendar();
		int dan = gc.get(GregorianCalendar.DAY_OF_MONTH);
		int mjesec = gc.get(GregorianCalendar.MONTH);
		int godina = gc.get(GregorianCalendar.YEAR);
		String[] kojiMjesec = { "Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "August", "Septembar",
				"Oktobar", "Novembar", "Decembar" };
		return dan + ". " + kojiMjesec[mjesec] + ", " + godina;
	}
}
