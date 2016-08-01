package zadaci_01_08_2016;

import java.util.Scanner;

public class NajveciZajednickiDjelilac {

	public static int najveciDjelilac(int prviBroj, int drugiBroj) {
		int najveci = 0;
		// krecemo od manjeg broja ka jedinici i ako su i prvi i drugi broj
		// djeljivi sa njime to nam je najveci zajednicki djelilac i prekidamo
		// petlju
		for (int i = prviBroj; i >= 1; i--) {
			if (prviBroj % i == 0 && drugiBroj % i == 0) {
				najveci = i;
				break;
			}
		}
		return najveci;
	}

	public static void main(String[] args) {
		// pitamo korisnika da unese dva broja, ako unese nesto sto nije broj
		// upozorimo ga da je unos pogresan
		Scanner input = new Scanner(System.in);
		int prviBroj = 0, drugiBroj = 0;
		boolean pogresanUnos = true;
		while (pogresanUnos) {
			try {
				System.out.print("Unesite prvi broj: ");
				prviBroj = input.nextInt();
				System.out.print("Unesite drugi broj:");
				drugiBroj = input.nextInt();
				pogresanUnos = false;
			} catch (java.util.InputMismatchException ex) {
				System.out.println("Pogresan unos! Idemo ispocetka.");
				input.nextLine();
			}
		}
		// ako je prvi broj veci mjenjaju mjesta
		if (prviBroj > drugiBroj) {
			int temp = prviBroj;
			prviBroj = drugiBroj;
			drugiBroj = temp;
		}
		// ispisuje se najveci zajednicki djelilac
		System.out.println("Najveci zajednicki djelilac je: " + najveciDjelilac(prviBroj, drugiBroj));
		input.close();
	}

}
