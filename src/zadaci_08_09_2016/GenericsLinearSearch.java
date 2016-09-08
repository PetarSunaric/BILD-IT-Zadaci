package zadaci_08_09_2016;

public class GenericsLinearSearch {

	public static void main(String[] args) {

		// creates list of integers with 20 values
		Integer[] list = new Integer[20];
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}
		System.out.println(linearSearch(list, 1));
		System.out.println(linearSearch(list, 10));
		System.out.println(linearSearch(list, 30));
	}

	// returns index of number, if number is not in list returns -1
	public static <E extends Comparable<E>> int linearSearch(E[] list, E value) {

		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(value) == 0) {
				return i;
			}
		}

		return -1;
	}
}
