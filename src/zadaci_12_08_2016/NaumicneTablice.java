package zadaci_12_08_2016;

public class NaumicneTablice {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			// uzimamo random brojcanu vrijednost od A do Z i pretvaramo je u
			// slovo. ('Z' - 'A' + 1) prestavlja formulu za dobijanje koliko
			// mjesta posle slova A cemo uzimati za random, tj koliko slova
			// ukupno ima(+1 dodajemo jer Matrh.random() uvijek ide jedan manje)
			char ch = (char) ('A' + (Math.random()) * ('Z' - 'A' + 1));
			System.out.print(ch);
		}
		System.out.print("-");
		// printa random 4 broja
		for (int i = 0; i < 4; i++) {
			int broj = (int) (Math.random() * 10);
			System.out.print(+broj);
		}

	}

}
