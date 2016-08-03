package zadaci_03_08_2016;
/* Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu.
 *  Metoda treba da koristi sljedeæi header:

 *public static int[ ] locateLargest(double[ ][ ] a)

 *Napisati test program koji pita korisnika da unese 2D niz 
 *te mu ispisuje lokaciju najveæeg elementa u nizu.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class LokacijaNajvecegElementaDvaDNiza {

	public static int[] locateLargest(double[][] a) {
		// pravimo niz koji ce sadrzati 2 elementa, tj nasu lokaciju najveceg
		// elementa, i promjenljivu max koja sprema najveci element
		int[] largest = new int[2];
		double max = 0;
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) {
				// kada nadjemo broj koji je veci od max, max postaje taj broj a
				// elementi niza postaju x i y
				if (a[x][y] > max) {
					max = a[x][y];
					largest[0] = x;
					largest[1] = y;
				}
			}
		}
		return largest;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// napravimo 3x3 matricu
		double[][] matrica = new double[3][3];
		boolean greska = true;
		System.out.print("Unesite 3x3 matricu: ");
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
		for (double[] e : matrica) {
			for (double b : e) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		// presledjuemo matricu metodi a od nje dobijamo lokaciju niza koju
		// dodjeljujemo nasem nizu.
		int[] niz = locateLargest(matrica);
		// i na kraju ispisujemo elemente naseg niza
		System.out.println("Najveci elemenat se nalazi na lokaciji: [" + niz[0] + "][" + niz[1] + "]");
		input.close();
	}

}
