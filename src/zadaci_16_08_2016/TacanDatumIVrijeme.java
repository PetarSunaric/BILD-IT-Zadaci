package zadaci_16_08_2016;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TacanDatumIVrijeme {

	public static void main(String[] args) {
		System.out.println("Trenutni datum i vrijeme: " + getCurrentTime());

	}

	public static String getCurrentTime() {
		// koristimo klasu date koja sadrzi trenutacni datum i vrijeme
		Date date = new Date();
		// metoda toString nam vraca sve to a usput i formatiramo sta i kako
		// zelimo da dobijemo
		return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(date).toString();
	}
}
