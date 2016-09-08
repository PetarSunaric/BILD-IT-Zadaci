package zadaci_08_09_2016;

public class MaximumElementInArray {

	public static void main(String[] args) {

		// creates list of 10 integers
		Integer[] list = new Integer[10];
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}

		System.out.println("Max = " + max(list));
	}

	// finds maximum in list
	public static <E extends Comparable<E>> E max(E[] list) {

		E max = list[0];
		for (int i = 1; i < list.length; i++) {
			E element = list[i];
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}

		return max;
	}
}
