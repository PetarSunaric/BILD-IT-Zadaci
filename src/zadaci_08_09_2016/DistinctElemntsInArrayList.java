package zadaci_08_09_2016;

import java.util.ArrayList;

public class DistinctElemntsInArrayList {

	public static void main(String[] args) {

		// create list with 10 times word Hello
		ArrayList<String> strings = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			strings.add("Hello");
		}

		strings = removeDuplicates(strings);

		// prints list
		for (String e : strings) {
			System.out.println(e);
		}
	}

	// removes duplicates from list
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

		ArrayList<E> newList = new ArrayList<>(list.size());
		for (E aList : list) {
			if (!newList.contains(aList)) {
				newList.add(aList);
			}
		}
		return newList;
	}
}