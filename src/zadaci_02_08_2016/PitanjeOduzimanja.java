package zadaci_02_08_2016;

import java.util.Scanner;

/*Napisati metodu koja prima jedan argument, broj pitanja,
 *  te generiše toliko nasumiènih, jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“.
 *   Metoda treba da broji broj taènih i netaènih odgovora te ih ispiše korisniku.*/

public class PitanjeOduzimanja {

	public static void pitanja(int brojPitanja) {
		Scanner input = new Scanner(System.in);
		int tacniOdgovori = 0, netacniOdgovori = 0;
		// petlja ce se obrnuti onoliko puta koliko imamo pitanja
		for (int i = 0; i < brojPitanja; i++) {
			// generisemo 2 random broja
			int broj1 = (int) (Math.random() * 10);
			int broj2 = (int) (Math.random() * 10);
			// ako je prvi broj manji zamjene mjesta kako bi rezultat bio
			// pozitivan
			if (broj1 < broj2) {
				int temp = broj1;
				broj1 = broj2;
				broj2 = temp;
			}
			// pitamo korisnika za rezultat
			int odgovor = 0;
			try {
				System.out.println("##################\nKoliko je " + broj1 + "-" + broj2 + " ?");
				odgovor = input.nextInt();
			} catch (java.util.InputMismatchException ex) {
				System.out.println("Pogresan unos!");
				i--;
				input.nextLine();
				continue;
			}
			// ako je tacan povecavamo broj tacnih odgovora
			if (odgovor == broj1 - broj2) {
				tacniOdgovori++;
				System.out.println("Tacno!");
				// ako nije tacan povecavamo broj netacnih odgovora i ispisujemo
				// tacan rezultat
			} else {
				netacniOdgovori++;
				System.out.println("Netacno! " + broj1 + "-" + broj2 + " je " + (broj1 - broj2));
			}
		}
		// na kraju ispisujemo broj tacnih i broj netacnih odgovora
		System.out.println("##################\nBroj tacnih odgovora je: " + tacniOdgovori
				+ "\nBroj netacnih odgovora je: " + netacniOdgovori);
		input.close();
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// unosimo broj pitanja
		int brojPitanja = 0;
		boolean pogresno = true;
		// sve dok ne unesemo broj pitamo ponovo da se unese broj pitanja
		while (pogresno) {
			try {
				System.out.print("Unesite broj pitanja: ");
				brojPitanja = input.nextInt();
				// kada je unijet broj petlja se zavrsava
				pogresno = false;
			} catch (java.util.InputMismatchException ex) {
				System.out.println("Pogresan unos!");
				input.nextLine();
			}
		}
		pitanja(brojPitanja);

		input.close();

	}

}
