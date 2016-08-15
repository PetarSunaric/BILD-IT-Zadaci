package zadaci_15_08_2016;

public class RandomMjesec {

	public static void main(String[] args) {

		// random broj od 1 do 12
		int mjesec = (int) (1 + (Math.random() * 12));
		// mjeseci po imenima
		String[] imeMjeseca = { "Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "August", "Septembar",
				"Oktobar", "Novembar", "Decembar" };
		// -1 jer indexi pocinju od 0
		System.out.println("Vas random mjesec je " + imeMjeseca[(mjesec - 1)]);

	}

}
