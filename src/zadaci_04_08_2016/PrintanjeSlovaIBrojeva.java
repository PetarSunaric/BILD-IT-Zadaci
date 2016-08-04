package zadaci_04_08_2016;

public class PrintanjeSlovaIBrojeva {

	public static void print() {
		int count = 0;
		// petlja ogranicava da bude tacno 100 slova
		for (int i = 0; i < 100; i++) {
			// uzimamo random brojcanu vrijednost od A do Z i pretvaramo je u
			// slovo. ('Z' - 'A' + 1) prestavlja formulu za dobijanje koliko
			// mjesta posle slova A cemo uzimati za random, tj koliko slova
			// ukupno ima(+1 dodajemo jer Matrh.random() uvijek ide jedan manje)
			char ch = (char) ('A' + (Math.random()) * ('Z' - 'A' + 1));
			count++;
			// printamo slovo, ako je brojac djeljiv sa 10 prelazimo u novi red
			if (count % 10 == 0) {
				System.out.println(ch + " ");
			} else {
				System.out.print(ch + " ");
			}
		}
		System.out.println();
		for (int i = 0; i < 100; i++) {
			// uzimamo random vrijednost od o do 100
			int broj = (int) (Math.random() * 100);
			count++;
			// printamo broj, ako je count djeljiv sa 10 prelazimo u novi red,
			// formatiramo sa printf 3 mjesta prostora, kako bismo dobili desno
			// poravnanje
			if (count % 10 == 0) {
				System.out.printf("%3d \n", broj);
			} else {
				System.out.printf("%3d", broj);
			}

		}
	}

	public static void main(String[] args) {

		// pozivamo metodu
		print();

	}

}
