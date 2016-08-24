package zadaci_23_08_2016;

public class PrimeNumbers {

	public static void main(String[] args) {

		StackOfIntegers stack = new StackOfIntegers();
		// checking numbers from 2 to 120
		for (int i = 2; i < 120; i++) {
			if (isPrime(i)) {// if number is prime
				stack.push(i);// remember it
			}
		}
		while (!stack.empty())// print until stack is empty
			System.out.print(stack.pop() + " ");
	}

	//checks if number is prime
	public static boolean isPrime(int broj) {
		for (int i = 2; i < broj; i++) {
			if (broj % i == 0) {
				return false;
			}
		}
		return true;
	}
}

//class that stacks numbers
class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int MAX_SIZE = 16;

	/** Construct a stack with the default capacity 16 */
	public StackOfIntegers() {
		this(MAX_SIZE);
	}

	/** Construct a stack with the specified maximum capacity */
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	/** Push a new integer into the top of the stack */
	public int push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		return elements[size++] = value;
	}

	/** Return and remove the top element from the stack */
	public int pop() {
		return elements[--size];
	}

	/** Return the top element from the stack */
	public int peek() {
		return elements[size - 1];
	}

	/** Test whether the stack is empty */
	public boolean empty() {
		return size == 0;
	}

	/** Return the number of elements in the stack */
	public int getSize() {
		return size;
	}
}