package zadaci_07_09_2016;

import java.util.Scanner;

public class LargestNumberInArray {

	public static void main(String[] args) {

		// creates array of 8 integers
		int[] array = new int[8];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 8 integers: ");

		for (int i = 0; i < array.length; i++)
			array[i] = input.nextInt();

		// prints largest number
		System.out.println("The largest number is " + getLargest(array, 0, array[0]));
		input.close();
	}

	// returns largest number
	private static int getLargest(int[] array, int i, int max) {

		if (i == array.length) // when it comes to end will stop method
			return max;

		if (max < array[i])	// if finds larger than max, max will become that number
			max = array[i];

		return getLargest(array, ++i, max);// calling method with i increased by 1
	}

}
