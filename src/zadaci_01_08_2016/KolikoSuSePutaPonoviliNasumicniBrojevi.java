package zadaci_01_08_2016;

public class KolikoSuSePutaPonoviliNasumicniBrojevi {

	public static void ponovioPuta(int broj, int[] niz) {
		int count = 0;
		// petlja prolazi kroz niz i ako je poslati broj jednak onom u nizu
		// povecava count za 1
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == broj) {
				count++;
			}
		}
		// ispisuje trenutni broj i koliko puta se ponovio
		System.out.println(broj + " se ponovio " + count + " puta.");
	}

	public static void main(String[] args) {
		// pravimo niz i u njega smjestamo 100 random brojeva od 0 do 9
		int[] niz = new int[100];
		for (int i = 0; i < 100; i++) {
			niz[i] = (int) (Math.random() * 10);
		}
		// prosljedjujemo metodi niz i jedan po jedan broj od nula do 9
		for (int i = 0; i < 10; i++) {
			ponovioPuta(i, niz);
		}

	}

}
