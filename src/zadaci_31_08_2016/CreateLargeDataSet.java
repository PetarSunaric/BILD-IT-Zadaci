package zadaci_31_08_2016;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateLargeDataSet {

	public static void main(String[] args) throws IOException {

		// making a file
		File file = new File("src/zadaci_31_08_2016/Salary.txt");
		FileWriter fw = new FileWriter(file);

		String[] rank = { "assistant", "associate", "full" };// rank of
																// profesors

		for (int i = 1; i < 1001; i++) {
			int rankRandom = (int) (Math.random() * 3);// random rank
			fw.write("FirstName" + i + " LastName" + i + " " + rank[rankRandom] + " ");
			switch (rankRandom) {// random salary
			case 0:
				fw.write((int) (50000 + (Math.random() * 30000)) + "");
				break;
			case 1:
				fw.write((int) (60000 + (Math.random() * 40000)) + "");
				break;
			case 2:
				fw.write((int) (75000 + (Math.random() * 55000)) + "");
				break;
			default:
				fw.write("WTF");
			}
			fw.write("." + (int) (Math.random() * 100) + "\n");// random decimal
																// value
		}
		fw.close();

	}

}
