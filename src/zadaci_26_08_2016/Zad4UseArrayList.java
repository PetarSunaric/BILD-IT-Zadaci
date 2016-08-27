package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Date;

public class Zad4UseArrayList {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();

		// creating instances of classes
		Loan loan = new Loan();
		Circle circle = new Circle();
		Date date = new Date();

		// adding instances to list
		list.add(loan);
		list.add(circle);
		list.add(date);

		// printing all elements of list
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}

// Loan class with simple print
class Loan {

	@Override
	public String toString() {
		return "This is a Loan class";
	}
}

// Circle class with simple print
class Circle {

	@Override
	public String toString() {
		return "This is a Circle class";
	}
}