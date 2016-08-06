package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite broj: ");
		//provjeravamo uneseni broj
		int broj = checkInput();
		if (isPalindrome(broj)) {
			System.out.println("Broj je palindrom");
		} else
			System.out.println("Broj nije palindrom");

	}

	public static int reverse(int number) {
		// uvodimo novu promjenljivu noviBroj
		int noviBroj = 0;
		int sledecaCifra;
		while (number % 10 != 0) {
			//sledecu cifru od zada dobijamo ko ostatak djeljenja sa 10
			sledecaCifra = number % 10;
			//novi broj postaje
			noviBroj = noviBroj * 10 + sledecaCifra;
			//broj postaje broj bez zadnje cifre
			number /= 10;
			//ako je broj manji od 10 novi broj postaje
			if (number < 10) {
				noviBroj = noviBroj * 10 + number;
				break;
			}
		}
		return noviBroj;
	}

	public static boolean isPalindrome(int number) {
		// pretvorimo prvi broj u string
		String str1 = "" + number;
		// pretvorimo obrnut broj u string
		String str2 = "" + reverse(number);
		for (int i = 0; i < str1.length(); i++)
			// ako broj i obrnut broj imaju razlicite brojeve na istim indexima
			// vrati false
			if (str1.charAt(i) != str2.charAt(i))
				return false;
		// ako su svi isti brojevi isti vrati true;
		return true;
	}

	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 0)
					throw new InputMismatchException("Negativan broj");
				// if input is correct stop loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unsite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
