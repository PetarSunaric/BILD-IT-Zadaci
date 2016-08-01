package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class KolikoSeNajveciBrojPutaPonovio {

	public static int max(ArrayList<Integer> list) {
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

	public static void putaPonovio(int broj, ArrayList<Integer> list) {
		int count = 0;
		// prolazimo kroz listu i ako je taj broj iz liste jednak broju
		// povecavamo count koji ce nam prestavljati koliko se puta broj ponovio
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == broj) {
				count++;
			}
		}
		System.out.println("Najveci broj je broj " + broj + " i ponovio se " + count + " puta");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// pravimo listu u koju smjestamo brojeve
		ArrayList<Integer> list = new ArrayList<>();
		int i = 1;
		do {
			System.out.print("Unesite broj: ");
			i = input.nextInt();
			list.add(i);
		} while (i != 0);
		// prosljedjujemo listu metodi koja ce da odredi najveci i vrati broj, a
		// onda taj broj i listu prosledjujemo metodi koja odredjuje koliko puta
		// se ponovio
		putaPonovio(max(list), list);
		input.close();
	}

}
