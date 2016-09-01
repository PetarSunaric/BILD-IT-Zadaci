package zadaci_31_08_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ProcesScoresOnWeb {

	public static void main(String[] args) throws IOException {

		// taking path for url
		URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
		Scanner input = new Scanner(url.openStream());// opening url

		int count = 0;// count numbers
		double sum = 0;
		while (input.hasNext()) {
			int num = input.nextInt();// take number
			count++;// increase count
			sum += num;// add it to sum
		}
		System.out.printf("Total is: %3d and average is: %2.2f", (int) sum, (sum / count));
		input.close();
	}

}
