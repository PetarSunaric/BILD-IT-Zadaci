package zadaci_02_08_2016;
/* Napisati program koji ispisuje sve prestupne godine, 10 po liniji, 
 * od godine 101 do 2100,odvojene jednim spaceom. 
 * Takoðer ispisati i ukupan broj prijestupnih godina u ovom vremenskom periodu.*/

public class PrestupneGodine {

	public static void main(String[] args) {
		int prestupneGodine = 0;
		// uzimamo raspon godina od 101 do 2100
		for (int godina = 101; godina < 2101; godina++) {
			// postavljamo uslov koji ce nam izdvojiti prestupne godine
			if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)) {
				// ispisujemo godine sa razmakom
				System.out.print(godina + " ");
				prestupneGodine++;
				// kada je broj prestupnih godina djeljiv sa 10 prelazimo u novi
				// red
				if (prestupneGodine % 10 == 0) {
					System.out.println();
				}

			}
		}
		System.out.println("\nUkupno prestupnih godina: "+prestupneGodine);

	}

}
