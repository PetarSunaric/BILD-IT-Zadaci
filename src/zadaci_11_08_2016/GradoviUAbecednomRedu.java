package zadaci_11_08_2016;

import java.util.Scanner;

public class GradoviUAbecednomRedu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// unosimo gradove
		System.out.print("Unesite prvi grad: ");
		String grad1 = input.nextLine();
		System.out.print("Unesite drugi grad: ");
		String grad2 = input.nextLine();
		System.out.print("Unesite treci grad: ");
		String grad3 = input.nextLine();
		opadajuciRed(grad1, grad2, grad3);
		input.close();
	}

	public static void opadajuciRed(String grad1, String grad2, String grad3) {
		// ako grad1 ima vecu vrijednost stringa ima vecu vrijednost od grad2
		// zamjene mjesta i tako i ostala dva puta
		if (grad1.compareToIgnoreCase(grad2) > 0) {
			String temp = grad1;
			grad1 = grad2;
			grad2 = temp;
		}
		if (grad2.compareToIgnoreCase(grad3) > 0) {
			String temp = grad2;
			grad2 = grad3;
			grad3 = temp;
		}
		if (grad1.compareToIgnoreCase(grad2) > 0) {
			String temp = grad1;
			grad1 = grad2;
			grad2 = temp;
		}
		System.out.println("Gradovi po abecednom redu: " + grad1 + " " + grad2 + " " + grad3);
	}

}
