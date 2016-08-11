package zadaci_10_08_2016;

public class TwinPrimeBrojevi {

	public static void main(String[] args) {

		// brojac parova
		int count = 0;
		// petlja ide do 10000
		for (int i = 2; i < 10000; i++) {
			// ako je broj i dva broja posle prime ispisi ih
			if (isPrime(i) && isPrime(i + 2)) {
				count++;
				// ako je broj parova djeljvi sa 10 predji u novi red
				if (count % 10 == 0)
					System.out.println(i + " i " + (i + 2));
				System.out.print(i + " i " + (i + 2) + ", ");

			}
		}

	}

	// provjerava da li je broj prost
	public static boolean isPrime(int broj) {
		for (int i = 2; i < broj; i++) {
			if (broj % i == 0) {
				return false;
			}
		}
		return true;
	}
}
