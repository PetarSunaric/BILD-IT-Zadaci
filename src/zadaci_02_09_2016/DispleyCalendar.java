package zadaci_02_09_2016;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DispleyCalendar {

	public static void main(String[] args) {

		// inputs year and month
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = input.nextInt();
		System.out.println("Enter month (1 - 12):");
		int month = input.nextInt();

		printCalendar(month, year);
		input.close();
	}

	public static void printCalendar(int month, int year) {
		System.out.println("\t\t   " + getMonthName(month) + year);
		System.out.println("---------------------------------------------------");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, 1);
		int start = calendar.get(GregorianCalendar.DAY_OF_WEEK); // first day of
																	// the weak
		for (int i = 1; i < start; i++) { // empty spaces before first day
			System.out.print("\t");
		}
		for (int i = 1; i <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			System.out.printf("%3d\t", i);
			if ((i + start - 1) % 7 == 0) { // go to new row is there is 7
											// places used
				System.out.println();
			}
		}
		System.out.println("\n");
	}

	// get month name
	public static String getMonthName(int month) {
		String s = "";
		switch (month) {
		case 1:
			s = "January ";
			break;
		case 2:
			s = "February ";
			break;
		case 3:
			s = "March ";
			break;
		case 4:
			s = "April ";
			break;
		case 5:
			s = "May ";
			break;
		case 6:
			s = "June ";
			break;
		case 7:
			s = "July ";
			break;
		case 8:
			s = "August ";
			break;
		case 9:
			s = "September ";
			break;
		case 10:
			s = "October ";
			break;
		case 11:
			s = "November ";
			break;
		case 12:
			s = "December ";
			break;
		}
		return s;
	}
}
