package zadaci_31_08_2016;

import java.io.File;
import java.util.Scanner;

public class ReformJavaSourceCode {

	public static void main(String[] args) throws Exception {

		// takes some argument
		File f1 = new File(args[0]);

		// reads from file
		Scanner input = new Scanner(f1);
		StringBuffer str = new StringBuffer();
		while (input.hasNext()) {
			str.append(input.nextLine() + System.lineSeparator());// taking
																	// string
		}
		input.close();

		String output = format(str.toString());// formating it
		System.out.println(output);//
	}

	// formats string
	public static String format(String s) {

		return s.replaceAll("\\)\\s*\\{", ") {");
	}
}
