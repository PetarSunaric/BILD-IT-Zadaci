package zadaci_17_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JedinstveniBrojevi {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		// deset brojeva
		for (int i = 0; i < 10; i++) {
			int broj = checkInput();
			// ako broj nije u listi ubaci ga u listu
			if (!list.contains(broj)) {
				list.add(broj);
			}
		}
		System.out.print("imamo " + list.size() + " jedinstenih brojeva a to su: ");
		// ispisuje brojeve
		for (int i : list) {
			System.out.print(i + " ");
		}
	}

	// provjerava unos
	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				System.out.print("Unesite broj: ");
				num = input.nextInt();
				// if input is correct stops loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unesite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
