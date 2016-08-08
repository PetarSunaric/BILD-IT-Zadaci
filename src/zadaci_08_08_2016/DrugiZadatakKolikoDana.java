package zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DrugiZadatakKolikoDana {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite mjesec(brojem): ");
		boolean greska = true;
		int mjesec = 1;
		// provjerava unos ako broj nije izmedju 1 i 12 izbacuje gresku
		do {
			mjesec = checkInput();
			if (mjesec < 1 || mjesec > 12) {
				System.out.print("Greska, unesite ponovo: ");
			} else {
				greska = false;
			}
		} while (greska);
		System.out.print("Unesite godinu: ");
		int godina = checkInput();
		brojDana(mjesec, godina);
	}

	// ispisuje broj dana
	public static void brojDana(int mjesec, int godina) {
		int brojDana = provjeriBrojDana(mjesec, godina);
		System.out.print("Mjesec " + kojiMjesec(mjesec) + " " + godina + ". godine ima " + brojDana + " dan");
		// ako je broj dana jednak 31 ostace "dan" ako ne bice "dana"
		if (brojDana < 31) {
			System.out.println("a");
		}
	}

	public static int provjeriBrojDana(int mjesec, int godina) {
		int numberOfDays = 0;
		// brojevi su mjeseci sa 31 dan
		if (mjesec == 1 || mjesec == 3 || mjesec == 5 || mjesec == 7 || mjesec == 8 || mjesec == 10 || mjesec == 12) {
			numberOfDays = 31;
			// mjeseci sa 30 dana
		} else if (mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec == 11) {
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

	// provjerava koji je mjesec
	public static String kojiMjesec(int mjesec) {

		switch (mjesec) {
		case 1:
			return "Januar";
		case 2:
			return "Februar";
		case 3:
			return "Mart";
		case 4:
			return "April";
		case 5:
			return "Maj";
		case 6:
			return "Jun";
		case 7:
			return "Jul";
		case 8:
			return "August";
		case 9:
			return "Septembar";
		case 10:
			return "Octobar";
		case 11:
			return "Novembar";
		case 12:
			return "Decembar";

		}
		return "Pogresan unos!";
	}

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

}
