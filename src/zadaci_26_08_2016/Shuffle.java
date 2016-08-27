package zadaci_26_08_2016;

import java.util.ArrayList;

public class Shuffle {

	public static void main(String[] args) {

		// creating list with numbers from 0 to 9
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		shuffle(list);
	}

	public static void shuffle(ArrayList<Integer> list) {

		while (list.size() != 0) { // while list isn't empty

			// get random number
			int j = (int) (Math.random() * (list.size()));
			// and print it
			System.out.print(list.get(j) + " ");
			list.remove(j); // after printing remove it
		}
	}
}
