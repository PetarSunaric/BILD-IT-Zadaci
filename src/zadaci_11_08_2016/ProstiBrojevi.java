package zadaci_11_08_2016;

public class ProstiBrojevi {

	public static void main(String[] args) {
		// brojac prostih brojeva
		int count = 0;
		for (int i = 2; i <= 1000; i++) {
			// ako je broj prost povecaj broj prostih brojeva
			if (isPrime(i)) {
				count++;
				// ako je broj prostih brojeva djeljiv sa 8 predji u novi red
				if (count % 8 == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");
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
