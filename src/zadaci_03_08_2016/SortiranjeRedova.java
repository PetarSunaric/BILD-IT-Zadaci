package zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/*Implementirati sljedeæu metodu da sortira redove u 2D nizu.

 *public static double[ ][ ] sortRows(double[ ][ ] array)

 *Napisati testni program koji pita korisnika da unese 3x3 matricu 
 *(ili da pita korisnika koliku matricu želi unijeti) te mu ispisuje 
 *na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najveæeg.*/

public class SortiranjeRedova {

	public static double[][] sortRows(double[][] array) {
		// prolazimo kroz matricu
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				try {
					// ako je trenutni elemenat matrice veci od narednog oni
					// zamjene mjesta
					if (array[x][y] > array[x][y + 1]) {
						double temp = array[x][y];
						array[x][y] = array[x][y + 1];
						array[x][y + 1] = temp;
						// vracamo se na pocetak reda kako bi ponovili postupak.
						y = -1;
					}
					// ukoliko nemamo narednog elementa, tj ukoliko cemo dobiti
					// error koristimo exception da bi nastavili na novi red
				} catch (ArrayIndexOutOfBoundsException ex) {
					continue;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = 0;
		boolean greska = true;
		while (greska) {
			try {
				System.out.print("Unesite duzinu redova i kolona(jedan broj): ");
				n = input.nextInt();
				greska = false;
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos! Pokusajte ponovo.");
				input.nextLine();
			}
		}
		System.out.println("Unesite " + n + "x" + n + " matricu: ");
		// nakon sto unesemo n on postaje duzina redova i kolona
		double[][] matrica = new double[n][n];
		for (int x = 0; x < matrica.length; x++) {
			for (int y = 0; y < matrica[x].length; y++) {
				greska = true;
				// unosimo elemenat matrice sve dok on nije broj
				while (greska) {
					try {
						matrica[x][y] = input.nextDouble();
						// kada kornik unese tacan unos prekidamo while petlju i
						// broj smjestamo u matricu
						greska = false;
					} catch (InputMismatchException ex) {
						System.out.print("Pogresan unos! Unesite ponovo: ");
						// resetujemo x i y kako bi unos isao ispocetka
						x = 0;
						y = 0;
						input.nextLine();
					}
				}
			}
		}
		// prikaz matrice
		System.out.println("Unijeta matrica: ");
		for (double[] e : matrica) {
			for (double b : e) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		// prosledjujemo unesenu matricu metodi koja ce sortirati redove i onda
		// adresu sortirane matrice dodjeljujemo novoj matrici
		double[][] matrica2 = sortRows(matrica);
		System.out.println("Sortirana matrica: ");
		// prikaz sortirane matrice
		for (double[] e : matrica2) {
			for (double b : e) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

		input.close();

	}

}
