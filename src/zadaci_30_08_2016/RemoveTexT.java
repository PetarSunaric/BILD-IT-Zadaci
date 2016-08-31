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
		// creating a help file that stores all the same as entered file but
		// without entered word
		File helpFile = new File("helpfile.txt");
		FileWriter fw = new FileWriter(helpFile);
		Scanner output = new Scanner(filename);
		while (output.hasNextLine()) {
			String str = output.nextLine();// taking a line
			str.replaceAll(args[0], "");// removes all words same as entered
			fw.write(str);// write a line in helpFile
		}
		// copy from help file to entered file
		Scanner output2 = new Scanner(helpFile);
		FileWriter fw2 = new FileWriter(filename);
		while (output2.hasNextLine()) {
			String str = output.nextLine();
			fw2.write(str + "\n");

		}

		fw.close();
		output.close();
		fw2.close();
		output2.close();
	}

}
