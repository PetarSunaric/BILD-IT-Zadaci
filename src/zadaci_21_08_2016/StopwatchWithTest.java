package zadaci_21_08_2016;

/*
 * -startTime:long
 * -endTime:long
 * -----------------
 * +Stopwatch()
 * +getStartTime():long
 * +getEndTime():long
 * +start():void
 * +stop():void
 * +getElapsedTime():long 
*/
public class StopwatchWithTest {
	public static void main(String[] args) {

		// creating array with 100000 random elements
		int[] nums = new int[100000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100);
		}
		// creating instance of class stopwatch
		Stopwatch sw = new Stopwatch();
		// starts time
		sw.start();
		// do sort
		selectionSort(nums);
		// stops time after finish
		sw.stop();
		// gets elapsed time in seconds
		System.out.println("Time needed for sorting: " + sw.getElapsedTime() / 1000.0 + " seconds");

	}

	// sorts array of numbers
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			// Find the minimum in the list
			int currentMin = array[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}
		}
	}
}

class Stopwatch {

	// data fields
	private long startTime;
	private long endTime;

	public Stopwatch() {
		this.startTime = System.currentTimeMillis();
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	// gets current time in millis
	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	public void stop() {
		this.endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}
}
