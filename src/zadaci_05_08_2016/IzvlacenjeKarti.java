package zadaci_05_08_2016;

public class IzvlacenjeKarti {

	public static void main(String[] args) {

		// pravimo 2 niza od kojih ce jedan sadrzavati sve moguce karte a drugi
		// sve znakove
		String[] karta = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] znak = { "Kocka", "Pik", "Srce", "Djetelina" };
		// pravimo 13 random brojeva od kojih ce svaki prestavljati jednu kartu
		int brojKarte = (int) (Math.random() * 13);
		// pravimo 4 random brojeva od kojih ce svaki prestavljati jedan znak
		int brojZnaka = (int) (Math.random() * 4);
		// kartu dobijamo tako sto uzimamo jedan elemanat iz niza karta i
		// dodjeljujemo mu jedan od 13 random brojeva kao index. Isto radimo i
		// za znak
		System.out.println("Izvukli ste: " + karta[brojKarte] + " " + znak[brojZnaka]);

	}

}
