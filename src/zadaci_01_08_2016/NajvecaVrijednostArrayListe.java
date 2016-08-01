package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class NajvecaVrijednostArrayListe {

	public static Integer max(ArrayList<Integer> list) {
		// Ako je lista nije prazna radimo sledece
		if (list.size() > 0) {
			// Pravimo maxValue koji prestavlja najvecu vrijednost u listi
			int maxValue = 0;
			// Prolazimo kroz listu i provjeravamo da li je i jedan broj veci od
			// maxValue, ako jeste maxValue postaje taj broj
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > maxValue) {
					maxValue = list.get(i);
				}
			}
			return maxValue;
		}
		// ukoliko je prazna vracamo nulu
		else
			return 0;
	}

	public static void main(String[] args) {
		// Pravimo ArrayList
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int i = 1;
		// Unosimo vrijednosti u ArrayList
		do {

			System.out.print("Unesite broj u ArrayList(nula prekida unos): ");
			// ukoliko unos nije broj izbacuje gresku
			try {
				i = input.nextInt();
				if (i != 0) {
					list.add(i);
				}
			} catch (java.util.InputMismatchException ex) {
				System.out.println("Niste unijeli broj, pokusajte ponovo!");
				input.nextLine();
			}
		} while (i != 0);
		// Ispisujemo ArrayList
		for (int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j) + " ");
		}
		System.out.println();
		// Ispisujemo najvecu vrijednost ArrayList ako lista nije prazna
		if (max(list) == 0) {
			System.out.println("Lista je prazna");
		} else {
			System.out.println("Najveca vrijednost ArreyList je: " + max(list));
		}
		input.close();
	}

}
