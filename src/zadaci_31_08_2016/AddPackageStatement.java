package zadaci_31_08_2016;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddPackageStatement {
	public static void main(String[] args) throws Exception {
		// Check command line parameter usage
		if (args.length != 1) {
			System.out.println("Usage java AddPackageStatement srcRootDirectory");
			System.exit(1);
		}

		// Check if file object is a Directory
		File rootDir = new File(args[0]);
		if (!rootDir.isDirectory()) {
			System.out.println("Directory " + args[0] + " does not exist");
			System.exit(2);
		}

		// Create list of directories
		ArrayList<File> chapters = getDirectories(rootDir);

		while (!chapters.isEmpty()) {
			// Create array of chapter files
			ArrayList<File> files = getFiles(chapters);

			insertStatement(files, chapters.get(0));

			chapters.remove(0);
		}
	}

	/** Inserts a string as first line for each file in a list */
	public static void insertStatement(ArrayList<File> list, File dir) throws Exception {
		for (int i = 0; i < list.size(); i++) {
			ArrayList<String> lines = new ArrayList<>();
			lines.add("package " + dir.getName() + ";");

			try (
					// Create input file
					Scanner input = new Scanner(list.get(i));) {
				while (input.hasNext()) {
					lines.add(input.nextLine());
				}
			}

			try (
					// Create input file
					PrintWriter output = new PrintWriter(list.get(i));) {
				for (int j = 0; j < lines.size(); j++) {
					output.println(lines.get(j));
				}
			}
		}
	}

	/** Adds all Java source files in directory to list */
	public static ArrayList<File> getFiles(ArrayList<File> dir) {
		if (!dir.get(0).isDirectory()) {
			System.exit(0);
		}
		ArrayList<File> list = new ArrayList<>(Arrays.asList(dir.get(0).listFiles()));

		filterJavaFiles(list);
		return list;
	}

	/** Removes non-Java source files from list */
	public static void filterJavaFiles(ArrayList<File> list) {
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i).getName();
			boolean isjavaCode = str.substring(str.lastIndexOf('.')).equals(".java");
			if (!isjavaCode)
				list.remove(i);
		}
	}

	/** Generates File objects and adds them to list */
	public static ArrayList<File> getDirectories(File root) {
		ArrayList<File> directories = new ArrayList<>();
		for (int i = 1; i < 34; i++) {
			directories.add(new File(root, "chapter" + i));
		}
		return directories;
	}
}
