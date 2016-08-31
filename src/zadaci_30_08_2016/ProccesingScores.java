package zadaci_30_08_2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProccesingScores {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the path of file: ");
		String path = input.next();
		File file = new File(path); // creates new file
		Scanner output = new Scanner(file); // creates scanner that reads from
											// file
		double sum = 0;
		int count = 0;
		while (output.hasNext()) { // while file is not empty
			int num = output.nextInt(); // take num
			sum += num; // and add it to sum
			count++; // and increase count by 1
		}
		System.out.println("Sum is: " + (int) sum);
		System.out.printf("Average is: %3.2f", (sum / count));
		input.close();
		output.close();
	}
}
