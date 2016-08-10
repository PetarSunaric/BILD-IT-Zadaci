package zadaci_09_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxUnos {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// pravimo listu koja ce smjestati unijete brojeve
				ArrayList<Integer> list = new ArrayList<>();
				int broj = 1;
				// unos dok se ne upise nula
				while (broj != 0) {
					System.out.print("Unesite broj(nula prekida unos): ");
					broj = checkInput();
					// kada unese broj ubacuje ga u listu
					list.add(broj);
				}
				maxPutaPonovio(list);
			}

			public static void maxPutaPonovio(ArrayList<Integer> list) {
				// stavljamo prvi broj u listi da nam je max
				int max = list.get(0);
				int count = 0;
				for (int i = 1; i < list.size(); i++) {
					// ako je broj veci od max max postaje taj broj i resetujemo count
					if (list.get(i) > max) {
						max = list.get(i);
						count = 1;
						// ako je broj jednak max povecavamo count
					} else if (list.get(i) == max) {
						count++;
					}
				}
				// ako je count prvi uneseni elemant povecavamo count za 1
				if (max == list.get(0))
					count++;
				System.out.println("Najveci elemenat je: " + max + " i ponovio se: " + count + " puta");
			}

			// provjerava unos
			public static int checkInput() {

				int num = 0;
				boolean error = true; // check for error

				do {
					try {
						num = input.nextInt();
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
