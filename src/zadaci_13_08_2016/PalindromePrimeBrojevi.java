package zadaci_13_08_2016;

public class PalindromePrimeBrojevi {

	public static void main(String[] args) {
		// brojac prostih brojeva i broj koji provjeravamo
		int countBrojeva = 0, broj = 2;
		while (countBrojeva < 100) {
			// ako je broj prost i palindrom povecavamo broj prostih brojeva i
			// ispisujemo ga
			if (isPrime(broj) && isPalindrome(broj)) {
				countBrojeva++;
				if (countBrojeva % 10 == 0) {
					System.out.println(broj);
				} else
					System.out.print(broj + " ");
			}
			// povecavamo broj kako bi ga provjerili
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

	// provjerava da li je broj palindrom
	public static boolean isPalindrome(int broj) {
		// ako je broj jednak obrnutom sebi onda je palindrom
		if (broj == reverse(broj)) {
			return true;
		}
		return false;
	}

	public static int reverse(int number) {
		// uvodimo novu promjenljivu noviBroj
		int noviBroj = 0;
		int sledecaCifra;
		while (number / 10 != 0) {
			// sledecu cifru od broja dobijamo ko ostatak djeljenja sa 10
			sledecaCifra = number % 10;
			// novi broj postaje
			noviBroj = noviBroj * 10 + sledecaCifra;
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
