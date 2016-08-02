package zadaci_02_08_2016;

import java.util.Scanner;

/* Napisati metodu koja prima jedan argument te simulira bacanje 
 * novèiæa toliko puta. Nakon što se simulacija završi,
 *  program ispisuje koliko puta je novèiæ pokazao glavu a koliko puta pismo.
*/

public class BacanjeNovcica {

	public static void pismoGlava(int brojBacanja){
		int pismo = 0, glava = 0;
		for (int i = 0; i < brojBacanja; i++) {
			// generisemo 2 random broja 0 i 1
			int bacanje = (int) (Math.random() * 2);
			// ukoliko je broj 0 ispisujemo glavu i povecavamo count glave za 1
			if (bacanje == 0) {
				System.out.println("Glava!");
				glava++;
				// u suprotnom ispisujemo pismo i povecavamo broj pisama za 1
			} else {
				System.out.println("Pismo!");
				pismo++;
			}
		}
		// Na kraju ispisujemo broj glava i pisama. Ukoliko je broj veci od 1
		// dodajemo a na kraju rijeci put
		System.out.print("Dobili ste " + glava + " put");
		if (glava != 1) {
			System.out.print("a glavu i ");
		} else
			System.out.print(" glavu i ");
		System.out.print(pismo + " put");
		if (pismo != 1) {
			System.out.println("a pismo.");
		} else {
			System.out.println(" pismo.");
		}
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean pogresno = true;
		int brojBacanja = 0;
		// pitate korisnika koliko puta cete baciti novcic
		while (pogresno) {
			try {
				System.out.println("Koliko puta cete bacati novcic?");
				brojBacanja = input.nextInt();
				// kada je unos broj petlja se prekida
				pogresno = false;
			} catch (java.util.InputMismatchException ex) {
				System.out.println("Pogresan unos!");
				input.nextLine();
			}
		}
		pismoGlava(brojBacanja);

		input.close();
	}

}
