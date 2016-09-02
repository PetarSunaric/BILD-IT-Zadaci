package zadaci_01_09_2016;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SortArrayList {

	public static void main(String[] args) {

		// creating list wih 10 numbers
		ArrayList<Number> list = new ArrayList<>();
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}

		sort(list);
		// prints list
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

	public static void sort(ArrayList<Number> list) {

		for (int i = 0; i < list.size() - 1; i++) {
			Number min = list.get(i); // setting start element as minumum
			int minIndex = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (compareTo(min, list.get(j)) > 0) { // if finds element
														// smaller than min
					min = list.get(j); // that element becomes min
					minIndex = j; // and min index becomes current index
				}
			}
			if (minIndex != i) { // in case that current minIndex not i
				list.set(minIndex, list.get(i));// swaps elements
				list.set(i, min);
			}
		}
	}

	public static int compareTo(Number n1, Number n2) {
		// ignoring null handling
		BigDecimal b1 = new BigDecimal(n1.doubleValue());
		BigDecimal b2 = new BigDecimal(n2.doubleValue());
		return b1.compareTo(b2);
	}
}
