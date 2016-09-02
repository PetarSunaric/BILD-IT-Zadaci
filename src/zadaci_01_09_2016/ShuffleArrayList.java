package zadaci_01_09_2016;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {

	public static void main(String[] args) {

		// create list
		ArrayList<Number> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		shuffle(list);
		// prints list
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

	// shuffle list
	public static void shuffle(ArrayList<Number> list) {

		Collections.shuffle(list);

	}
}
