package zadaci_01_09_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ProcesingLargeDataset {

	public static void main(String[] args) throws IOException {

		// taking url and read it
		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
		Scanner input = new Scanner(url.openStream());

		double total = 0, count = 0; // for all
		double totalAssistant = 0, countAssistant = 0;// for assistants
		double totalAssociate = 0, countAssociate = 0;// for associate
		double totalFull = 0, countFull = 0;// for full

		while (input.hasNextLine()) {
			String str = input.nextLine();// takes line
			String[] split = str.split(" ");// split it into array of strings
			double salary = Double.parseDouble(split[3]);// take element on last
															// index as salary

			// adds salary to specific total and increase count
			total += salary;
			count++;
			if (split[2].equals("assistant")) {
				totalAssistant += salary;
				countAssistant++;
			} else if (split[2].equals("associate")) {
				totalAssociate += salary;
				countAssociate++;
			} else if (split[2].equals("full")) {
				totalFull += salary;
				countFull++;
			}

		}
		// prints all
		System.out.printf("Total assistants salary is: %4d and average is: %6.2f\n", (int) totalAssistant,
				(totalAssistant / countAssistant));
		System.out.printf("Total associate salary is: %4d and average is: %6.2f\n", (int) totalAssociate,
				(totalAssociate / countAssociate));
		System.out.printf("Total full salary is: %4d and average is: %6.2f\n", (int) totalFull,
				(totalFull / countFull));
		System.out.printf("Total salary for all is: %4d and average is %6.2f", (int) total, (total / count));
		input.close();
	}

}
