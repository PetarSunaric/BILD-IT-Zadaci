package zadaci_09_08_2016;

import java.util.Scanner;

public class KojiJeDanUbuducnosti {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite broj za danasnji dan(0 ponedjeljak, 1 utorak itd): ");
		// unosimo danasnji dan
		int dan = input.nextInt();
		System.out.print("Unesite dan u buducnosti: ");
		// unosimo dan u buducnosti
		int buduciDan = input.nextInt();
		// dan u buducnosti dobijamo tako sto saberemo danasnji dan i koliko jos
		// dana i podjelimo sa 7 dana u sedmici
		System.out.println("Danas je " + kojiDan(dan) + ", a dan u buducnosti je: " + kojiDan((dan + buduciDan) % 7));

	}

	// provjerava koji je dan
	public static String kojiDan(int dan) {

		switch (dan) {
		case 0:
			return "Ponedjeljak";
		case 1:
			return "Utorak";
		case 2:
			return "Srijeda";
		case 3:
			return "Cetvrtak";
		case 4:
			return "Petak";
		case 5:
			return "Subota";
		case 6:
			return "Nedjelja";

		}
		return "Pogresan unos!";
	}
}
