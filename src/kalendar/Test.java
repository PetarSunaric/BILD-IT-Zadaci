package kalendar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	static final Scanner input = new Scanner(System.in);
	static File file = new File("src/kalendar/repository.txt");

	public static void main(String[] args) throws IOException {

		GregorianCalendar gc = new GregorianCalendar();
		boolean wrong = true;
		// it will loop while input is not correct
		System.out.print("\nWellcome, today is " + gc.get(GregorianCalendar.DAY_OF_MONTH) + ". "
				+ (gc.get(GregorianCalendar.MONTH) + 1) + ". " + gc.get(GregorianCalendar.YEAR) + ". \n");
		while (wrong) {
			System.out.println("\n###########################################");
			// gets current date
			System.out.print("\n1.Specific month\n2.Reminder\n3.Turn off\n\nYou choose option: ");
			// will insure right input
			int option = checkInput();
			// by choosing one of the options will call method
			if (option == 1) {
				specificCalendar();
			} else if (option == 2) {
				enteredReminds();
			} else if (option == 3) {
				System.exit(1);
			} else {
				System.out.println("Wrong input!");
			}
		}
	}

	public static void specificCalendar() throws IOException {
		boolean loop = true;
		while (loop) {
			System.out.println("\n###########################################");
			// when u enter month and year
			System.out.print("Enter month(number): ");
			int month = checkInput();
			System.out.print("Enter year: ");
			int year = checkInput();
			PrintCalendar pc = new PrintCalendar(month, year);
			// it will call class for printing calendar
			pc.printWholeCalendar();
			boolean wrong = true;
			// while input is wrong it will loop
			while (wrong) {
				System.out.print("1.Choose another month\n2.Set remind\n3.Back to first page\nYou choose: ");
				int choose = checkInput();
				switch (choose) {
				case 1:
					// if you choose 1 it will end loop and ask again for month
					// and year
					wrong = false;
					break;
				case 2:
					// will call metod for remind
					remind(month, year);
					break;
				case 3:
					// will stop this loop and loop before so you will go back
					// to main menu
					loop = false;
					wrong = false;
					break;
				default:
					// if it choose some other number writes this
					System.out.println("Wrong input, try again: ");
					break;
				}
			}
		}

	}

	public static void remind(int month, int year) throws IOException {
		// making buffered writer for writing in file
		BufferedWriter bf = new BufferedWriter(new FileWriter(file, true));
		PrintCalendar pc = new PrintCalendar(month, year);

		System.out.println("\n###########################################");
		System.out.print("Enter date of this month were you want remind: ");
		boolean incorect = true;
		int date = 0;
		// while incorrect will loop
		while (incorect) {
			date = checkInput();
			// if entered date is in range of the days of the current month do
			// something
			if (date < pc.getDaysInMonth(month, year) && date > 0) {
				incorect = false;
			} else {
				System.out.print("Wrogn input, try again: ");
			}
		}
		System.out.println("Enter the remind in one line: ");
		input.nextLine();
		String str1 = input.nextLine();
		// when user enter remind will write it to file by adding date, month
		// and year beffore remind
		bf.write(date + ". " + pc.getMonth() + " " + year + ".  " + str1 + "\n");
		bf.close();
		System.out.println("\n###########################################");
	}

	public static void enteredReminds() throws FileNotFoundException {
		System.out.println("\n###########################################");
		// taking file
		Scanner output = new Scanner(file);
		// while there is new line
		while (output.hasNextLine()) {
			// we take line and print it
			String str = output.nextLine();
			System.out.println(str);
		}
		output.close();
	}

	public static int checkInput() {

		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();
				if (num < 0)
					throw new InputMismatchException("Negative number");
				// if input is correct stop loop
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Wrong input, try again:  ");
				input.nextLine();
			}
			// will loop while error persist
		} while (error);

		return num;
	}

}
