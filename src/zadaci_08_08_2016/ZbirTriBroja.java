package zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZbirTriBroja {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// pravimo 3 random broja
		int broj1 = (int) (Math.random() * 10);
		int broj2 = (int) (Math.random() * 10);
		int broj3 = (int) (Math.random() * 10);
		boolean netacno = true;
		// dok je odgovor netacan vrtice petlju
		while (netacno) {
			System.out.print("Koliko je " + broj1 + "+" + broj2 + "+" + broj3 + "? ");
			int odgovor = checkInput();
			// ako je jednak zbiru ispisuje tacno u i prekida petlju
			if (odgovor == broj1 + broj2 + broj3) {
				System.out.println("Tacan odgovor!");
				netacno = false;
			} else {
				System.out.println("Netacno, pokusajte ponovo!");
			}
		}
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
