package zadaci_11_08_2016;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class TrenutniDatumIVrijeme {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Trenutni datum i vrijeme: " + getCurrentDate() + " " + getCurrentTime());

	}

	//dobijamo trenutno vrijeme
	public static String getCurrentTime() {
		long ukupnoSekundi = System.currentTimeMillis() / 1000;
		long sekundi = ukupnoSekundi % 60;
		long minuta = ukupnoSekundi / 60 % 60;
		//+2 je da bi izravnali vremenske zone
		long sati = ((ukupnoSekundi / 3600)+2) % 24;
		return sati + ":" + minuta + ":" + sekundi;
	}

	//doijamo trenutni datum
	public static String getCurrentDate() {
		GregorianCalendar gc = new GregorianCalendar();
		int dan = gc.get(GregorianCalendar.DAY_OF_MONTH);
		int mjesec = gc.get(GregorianCalendar.MONTH);
		int godina = gc.get(GregorianCalendar.YEAR);
		return dan + ". " + kojiMjesec(mjesec) + ", " + godina;
	}

	// provjerava koji je mjesec
	public static String kojiMjesec(int mjesec) {

		switch (mjesec) {
		case 0:
			return "Januar";
		case 1:
			return "Februar";
		case 2:
			return "Mart";
		case 3:
			return "April";
		case 4:
			return "Maj";
		case 5:
			return "Jun";
		case 6:
			return "Jul";
		case 7:
			return "August";
		case 8:
			return "Septembar";
		case 9:
			return "Octobar";
		case 10:
			return "Novembar";
		case 11:
			return "Decembar";

		}
		return "Pogresan unos!";
	}
}
