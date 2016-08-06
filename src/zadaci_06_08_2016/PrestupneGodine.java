package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrestupneGodine {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite donju granicu godina: ");
		int godina1 = checkInput();
		System.out.println("Unesite gornju granicu godina: ");
		int godina2 = checkInput();
		// ukoliko je prvi unos veci do drugog zamjene se
		if (godina1 > godina2) {
			int temp = godina1;
			godina1 = godina2;
			godina2 = temp;
		}
		// brojac godina
		int count = 0;
		// raspon godina je od pcetne godine do krajnje
		for (int i = godina1; i <= godina2; i++) {
			// provjeravamo da li je godina prestupna
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				count++;
				// ako je broj godina djeljiv sa 10 prelazi u novi red
				if (count % 10 == 0) {
					System.out.println(i + " ");
				} else {
					System.out.print(i + " ");
				}
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
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unsite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
