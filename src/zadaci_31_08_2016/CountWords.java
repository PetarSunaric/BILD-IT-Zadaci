package zadaci_31_08_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) throws IOException {

		// taking path for url
		URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
		Scanner input = new Scanner(url.openStream());// opening url

		int count = 0;
		while (input.hasNext()) {
			input.next();// take every word
			count++;// and count it
		}
		System.out.println("There are " + count + " words");
		input.close();
	}

}
