package zadaci_05_08_2016;

import java.util.Scanner;

public class IstiPrefix {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite prvi string: ");
		String str1 = input.nextLine();
		System.out.print("Unesite drugi string: ");
		String str2 = input.nextLine();
		// ovo koristimo da bi smo izbjegli indexOutOfBound error. Krajnji index
		// ce nam biti poslednji karakter manjeg stringa, jer logicno je ako
		// nema vise stringa da nemaju ni zajednicki prefix :D
		if (str1.length() < str2.length()) {
			istiPrefix(str1, str2);
		} else {
			istiPrefix(str2, str1);
		}
		input.close();
	}

	public static void istiPrefix(String str1, String str2) {
		System.out.println("Najveci zajednicki prefix za ova dva string je: ");
		// ako nema istih karaktera ispisemo da nema prefixa
		// uzimamo duzinu manjeg stringa
		if (str1.charAt(0) != str2.charAt(0)) {
			System.out.println("Stringovi nemaju zajednicki prefix!");
			System.exit(1);
		}
		for (int i = 0; i < str1.length(); i++) {
			// ako su karakteri isti ispisemo ih
			if (str1.charAt(i) == str2.charAt(i)) {
				System.out.print(str1.charAt(i));
				// koristimo kako ne bi ispisivalo ako su karakteri na nekim
				// drugim indexima isti
			} else {
				break;
			}
		}
	}

}
