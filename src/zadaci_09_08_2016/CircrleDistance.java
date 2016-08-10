package zadaci_09_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CircrleDistance {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// unosimo prvu koordinatu
		System.out.print("Unesite prvu koordinatu(x1,y1) u stepenima: ");
		double x1 = Math.toRadians(checkInput());
		double y1 = Math.toRadians(checkInput());
		// unosimo drugu koordinatu
		System.out.print("Unesite drugu koordinatu(x2,y2) u stepenima: ");
		double x2 = Math.toRadians(checkInput());
		double y2 = Math.toRadians(checkInput());
		// formula za udaljenost
		double distance = 6371.01
				* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y2 - y1));
		System.out.println("Udaljenost izmedju dvije tacke je: " + distance);
	}

	// provjerava unos
	public static double checkInput() {

		double num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextDouble();
				// if input is correct stops loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unsite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}

}
