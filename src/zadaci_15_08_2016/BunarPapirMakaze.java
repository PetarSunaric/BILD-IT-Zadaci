package zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BunarPapirMakaze {

	static Scanner input = new Scanner(System.in);
	static Random random = new Random();

	public static void main(String[] args) {

		// randomujemo po broj za svaki od znakova
		int bunar = random.nextInt(3);
		int papir = random.nextInt(3);
		// ako je broj vec iskoristen randomujemo sve dok ne dobijemo drugaciji
		while (papir == bunar) {
			papir = random.nextInt(3);
		}
		int makaze = random.nextInt(3);
		while (makaze == bunar || makaze == papir) {
			makaze = random.nextInt();
		}
		// random za racunar
		int racunar = random.nextInt(3);
		System.out.print("Unesite vas izbor: ");
		int izbor = checkInput();
		// ukoliko racunar i korisnik imaju isto nerijeseno je
		if (izbor == racunar) {
			System.out.println("Nerijeseno je");
			// zavisno od toga sta je ko dobio ispisujemo ko je pobjedio
		} else if (izbor == bunar) {
			if (racunar == papir) {
				System.out.println("Vas izbor je bunar, racunar je dobio papir. Racunar je pobjedio!");
			} else if (racunar == makaze) {
				System.out.println("Vas izbor je bunar, racunar je dobio makaze. Vi ste pobjedili!");
			}
		} else if (izbor == papir) {
			if (racunar == makaze) {
				System.out.println("Vas izbor je papir, racunar je dobio makaze. Racunar je pobjedio!");
			} else if (racunar == bunar) {
				System.out.println("Vas izbor je papir, racunar je dobio bunar. Vi ste pobjedili!");
			}
		} else if (izbor == makaze) {
			if (racunar == papir) {
				System.out.println("Vas izbor je makaze, racunar je dobio papir. Vi ste pobjedili!!");
			} else if (racunar == bunar) {
				System.out.println("Vas izbor je makaze, racunar je dobio bunar. Racunar je pobjedio!");
			}

		}
	}

	// provjerava unos
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 0 || num > 2)
					throw new InputMismatchException("Pogresan broj");
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
