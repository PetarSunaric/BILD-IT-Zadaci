package zadaci_05_09_2016;

import java.util.ArrayList;

public class RationalNumberCalculator {

	public static void main(String[] args) {

		String[] token = getTokens(args);

		// if calling is wrong
		if (token.length != 3 || !isValidOperator(token)) {
			System.out.println("Invalid arguments.");
			System.out.println("Usage: java RationalNumberCalculator 1/2 * 8/17");
			System.exit(1);
		}
		// instances of BigRational class
		BigRational operand1 = new BigRational(token[0]);
		BigRational operand2 = new BigRational(token[2]);

		BigRational answer = null;
		switch (args[1]) { // do operation depends on entered
		case "+":
			answer = operand1.add(operand2);
			break;
		case "-":
			answer = operand1.subtract(operand2);
			break;
		case "*":
			answer = operand1.multiply(operand2);
			break;
		case "/":
			answer = operand1.divide(operand2);
			break;
		}

		System.out.println(operand1 + " " + args[1] + " " + operand2 + " = " + answer);
	}

	private static boolean isValidOperator(String[] token) {

		return token[0].matches("[\\d]*[0-9]/[\\d]*[0-9]") && token[1].matches("[\\-\\+\\*\\/]")
				&& token[2].matches("[\\d]*[0-9]/[\\d]*[0-9]");
	}

	private static String[] getTokens(String[] strings) {
		String merged = " ";
		for (String s : strings) {
			merged += " " + s;
		}

		String[] tokens = merged.split("[\\s ]");
		ArrayList<String> temp = new ArrayList<>();
		// remove blanks
		for (String s : tokens) {
			if (s.length() != 0) {
				temp.add(s);
			}
		}
		return temp.toArray(new String[temp.size()]);
	}

}