package zadaci_12_08_2016;

public class ProstiBrojevi {

	public static void main(String[] args) {

		for (int i = 0; i < 100000; i++) {
			// ako je trenutni broj prost ispisi ga.
			if (isPrime(i) != 0)
				System.out.println(i);
		}
	}

	// provjerava da li je broj prost ako jeste vraca broj ako nije vraca 0
	public static int isPrime(int n) {
		for (int i = 2; i < n; i++) {
			// ako ima brojeva djeljivih sa trenutnim postavi broj na 0
			if (n % i == 0) {
				n = 0;
			}
		}
		return n;
	}

}
