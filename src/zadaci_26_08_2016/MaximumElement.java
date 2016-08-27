package zadaci_26_08_2016;

import java.util.ArrayList;

public class MaximumElement {

	public static void main(String[] args) {

		// making array list with numbers from 0 to 9
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		System.out.println("Max element is: " + max(list));
	}

	// returns max element of list
	public static Integer max(ArrayList<Integer> list) {
		int max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > max) // if element is larger than max
				max = list.get(i); // max become that element
		}
		return max;
	}
}
