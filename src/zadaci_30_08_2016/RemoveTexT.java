package zadaci_30_08_2016;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RemoveTexT {

	public static void main(String[] args) throws IOException {

		if (args.length != 2) {
			System.out.println("Invalid arguments.");
			System.out.println("Usage: java RemoveText word filename");
			System.exit(1);
		}
		// Check if the filename exist
		File filename = new File(args[1]);
		if (!filename.exists()) {
			System.out.println(args[1] + " does not exist.");
			System.out.println(2);
		}

		Scanner output = new Scanner(filename);
		String str = "";
		while (output.hasNextLine()) {
			str += output.nextLine() + "\n";// taking a whole file content
		}
		str.replaceAll(args[0], "");// removes all words same as entered

		FileWriter fw = new FileWriter(filename);
		fw.write(str + "\n");// writes string into file

		fw.close();
		output.close();
	}

}
