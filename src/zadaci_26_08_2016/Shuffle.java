package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {

	public static void main(String[] args) {

		// creating list with numbers from 0 to 9
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		shuffle(list);
		// print list
		System.out.println("Numbers in increasing order: ");
		for (int e : list) {
			System.out.print(e + " ");
		}
	}

	// shuffles array list
	public static void shuffle(ArrayList<Integer> list) {

		Collections.shuffle(list);

	}
}
