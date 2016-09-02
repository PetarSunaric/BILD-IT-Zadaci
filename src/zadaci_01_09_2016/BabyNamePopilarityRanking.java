package zadaci_01_09_2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BabyNamePopilarityRanking {

	public static void main(String[] args) throws IOException {

		// taking data
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.print("Enter the gender(M or F): ");
		char gender = input.next().charAt(0);
		System.out.print("Enter the name: ");
		String name = input.nextLine();

		// taking file with specific year
		File file = new File("babynameranking" + year + ".txt");
		Scanner output = new Scanner(file);// reads from file
		while (output.hasNextLine()) {
			String str = input.nextLine();// taking line
			String[] split = str.split(" ");// splitting words
			if (gender == 'M') {// if chosen gender is male taking second column
				if (split[1].equals(name)) {
					System.out.print(name + " is ranked #" + split[0] + "at year " + year);
					System.exit(1);
				}
			} else {
				if (split[3].equals(name)) {
					System.out.print(name + " is ranked #" + split[0] + "at year " + year);
					System.exit(2);
				}
			}
		}
		System.out.println(name + " is not ranked in year " + year);
		output.close();
		input.close();

	}

}
