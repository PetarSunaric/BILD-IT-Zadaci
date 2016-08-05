package zadaci_05_08_2016;

import java.util.Scanner;

public class IstiPrefix {

	public static void istiPrefix(String str1, String str2) {
		System.out.println("Najveci zajednicki prefix za ova dva string je: ");
		// broji zajednicke karaktere
		int count = 0;
		// uzimamo duzinu manjeg stringa
		for (int i = 0; i < str1.length(); i++) {
			// ako su karakteri isti ispisemo ih
			if (str1.charAt(i) == str2.charAt(i)) {
				System.out.print(str1.charAt(i));
				count++;
				// ako nema istih karaktera ispisemo da nema prefixa
			} else if (count == 0) {
				System.out.println("Stringovi nemaju zajednicki prefix!");
				break;
			}
		}
	}

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

}
