package zadaci_10_08_2016;

import java.util.Scanner;

public class SubstringStringa {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// unosimo prvi string
		System.out.println("Unesite prvi string: ");
		String str1 = input.nextLine();
		// unosimo drugi string
		System.out.println("Unesite drugi string: ");
		String str2 = input.nextLine();
		// ako prvi string sadrzi drugi string onda je drugi string substring
		// prvome
		if (str1.contains(str2))
			System.out.println(str2 + " je substring od " + str1);
		else
			System.out.println(str2 + " nije substring od " + str2);
		input.close();
	}

}
