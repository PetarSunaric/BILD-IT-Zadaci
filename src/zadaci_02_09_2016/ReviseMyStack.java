package zadaci_02_09_2016;

import java.util.ArrayList;

public class ReviseMyStack {

	public static void main(String[] args) {

		// instance of my stack
		MyStack stack1 = new MyStack();
		for (int i = 0; i < 10; i++) {// add 10 numbers from 0 go 10 to my stack
			stack1.push(i);
		}
		MyStack stack2 = (MyStack) stack1.clone();
		// get rid of two items
		stack1.pop();
		stack1.pop();

		// display size for both stacks to make sure they are different
		System.out.println("stack1 size = " + stack1.getSize());
		System.out.println("stack2 size = " + stack2.getSize());

	}

}

class MyStack implements Cloneable {

	// array list for numbers
	private ArrayList<Object> list = new ArrayList<>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override /** Override the toString in the Object class */
	public String toString() {
		return "stack: " + list.toString();
	}

	@Override
	protected Object clone() { // makes copy of my list
		MyStack myStack = null;
		try {
			myStack = (MyStack) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		myStack.list = new ArrayList<>(list);
		return myStack;
	}
}
