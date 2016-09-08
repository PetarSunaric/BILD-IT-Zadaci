package zadaci_08_09_2016;

public class GenericBinarySearch {

	public static void main(String[] args) {

		Integer[] list = new Integer[10];
		for (int i = 0; i < list.length; i++) {
			list[i] = i + 1;
		}

		// Test binarySearch
		System.out.println(binarySearch(list, 4));
		System.out.println(binarySearch(list, 12));

	}

	// returns index of element, if element is not in list returns -1
	public static <E extends Comparable<E>> int binarySearch(E[] list, E value) {

		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (high - low) / 2 + low;
			if (list[mid].compareTo(value) == 0)
				return mid;

			if (list[mid].compareTo(value) < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}

		return -1;
	}
}