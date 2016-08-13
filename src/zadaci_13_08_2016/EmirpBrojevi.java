package zadaci_13_08_2016;

public class EmirpBrojevi {

	public static void main(String[] args) {
		// brojac koji broji proste brojeve
		int countBrojeva = 0;
		// broj koji provjeravamo
		int broj = 11;
		while (countBrojeva < 100) {
			// ako su broj i obrnuti broj oba prosta i razlicita
			if (isPrime(broj) && isPrime(reverse(broj)) && (broj != reverse(broj))) {
				countBrojeva++;
				// svakih 10 brojeva predji u novi red
				if (countBrojeva % 10 == 0)
					System.out.println(broj);
				else
					System.out.print(broj + " ");
			}
			broj++;
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

	public static int reverse(int number) {
		// uvodimo novu promjenljivu noviBroj
		int noviBroj = 0;
		while (number / 10 != 0) {
			// number%10 je sledeca cifra
			noviBroj = noviBroj * 10 + number%10;
			// broj postaje broj bez zadnje cifre
			number /= 10;
			// ako je broj manji od 10 novi broj postaje
			if (number < 10) {
				noviBroj = noviBroj * 10 + number;
				break;
			}
		}
		return noviBroj;
	}
}
