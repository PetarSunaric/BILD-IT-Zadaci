package zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TreciZadatakKolikoDana {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesiste godinu: ");
		int godina = checkInput();
		System.out.print("Unesite prva tri slova Mjeseca(prvo slovo veliko): ");
		String mjesec = checkInputS();
		brojDana(mjesec, godina);
	}

	public static void brojDana(String mjesec, int godina) {
		int brojDana = provjeriBrojDana(mjesec, godina);
		System.out.print("Mjesec " + mjesec + " " + godina + ". godine ima " + brojDana + " dan");
		// ako je broj dana jednak 31 ostace "dan" ako ne bice "dana"
		if (brojDana < 31) {
			System.out.println("a");
		}
	}

	public static int provjeriBrojDana(String mjesec, int godina) {
		int numberOfDays = 0;
		// brojevi su mjeseci sa 31 dan
		if (mjesec.equals("Jan") || mjesec.equals("Mar") || mjesec.equals("Maj") || mjesec.equals("Jul")
				|| mjesec.equals("Aug") || mjesec.equals("Okt") || mjesec.equals("Dec")) {
			numberOfDays = 31;
			// mjeseci sa 30 dana
		} else if (mjesec.equals("Apr") || mjesec.equals("Jun") || mjesec.equals("Sep") || mjesec.equals("Nov")) {
			numberOfDays = 30;
			// ovo je Februar
		} else {
			// ako je godina prestupna 29 dana, ako nije 28
			if (jePrestupna(godina)) {
				numberOfDays = 29;
			} else
				numberOfDays = 28;
		}
		return numberOfDays;
	}

	// provjerava da li je godina prestupna
	public static boolean jePrestupna(int godina) {
		if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0))
			return true;
		return false;
	}

	// provjerava upis godine
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 0)
					throw new InputMismatchException("Negativan broj");
				// if input is correct stops loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unsite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}

	// provjerava upis mjeseca
	public static String checkInputS() {

		String str = "";
		boolean error = true; // check for error

		do {
			str = input.next();
			// ako je unijet jedan od mjeseci prekida petlju
			if (jeMjesec(str)) {
				error = false;
			} else {
				System.out.print("Pogresan unos, unesite ponovo: ");
			}
		} while (error);

		return str;
	}

	// provjerava da li je unijet jedan od mjeseci
	public static boolean jeMjesec(String str) {
		switch (str) {
		case "Jan":
			return true;
		case "Feb":
			return true;
		case "Mar":
			return true;
		case "Apr":
			return true;
		case "Maj":
			return true;
		case "Jun":
			return true;
		case "Jul":
			return true;
		case "Aug":
			return true;
		case "Sep":
			return true;
		case "Okt":
			return true;
		case "Nov":
			return true;
		case "Dec":
			return true;
		}
		return false;
	}

}
