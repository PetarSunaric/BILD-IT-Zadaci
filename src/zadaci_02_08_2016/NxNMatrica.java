package zadaci_02_08_2016;

/*	Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header:
	public static void printMatrix(int n)
	Svaki element u matrici je ili 0 ili 1, generisan nasumièno.
	Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.*/
import java.util.Scanner;

public class NxNMatrica {

	public static void printMatrix(int n) {
		// metoda uzima n kao redove i kolone matrice
		int[][] matrica = new int[n][n];
		for (int x = 0; x < matrica.length; x++) {
			for (int y = 0; y < matrica[x].length; y++) {
				// dodjeljuje im random vrijednosti 0 ili 1
				matrica[x][y] = (int) (Math.random() * 2);
			}
		}
		// ispisuje matricu koristeci for-each petlju
		for (int[] e : matrica) {
			for (int b : e) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// pitamo korisnika da unese N, ako unese nesto sem broja izbacuje
		// gresku i ponovo pita
		int broj = 0;
		boolean pogresanUnos = true;
		while (pogresanUnos) {
			try {
				System.out.println("Unesite broj N: ");
				broj = input.nextInt();
				// ukiliko je unijet broj program nastavlja sa radom
				pogresanUnos = false;
			} catch (java.util.InputMismatchException ex) {
				System.out.println("Pogresan unos!");
				input.nextLine();
			}
		}
		// proslijedimo N metodi
		printMatrix(broj);
		input.close();
	}

}
