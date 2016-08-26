package zadaci_25_08_2016;

import java.util.ArrayList;

public class StringSplitMethod {

	public static void main(String[] args) {

		String[] temp1 = split("ab#12#453", "#");
		for (String e : temp1) {
			System.out.print(e);
		}

		String[] temp2 = split("\na?b?gf#e", "[?#]");
		for (String e : temp2) {
			System.out.print(e);
		}

	}

	public static String[] split(String s, String regex) {

		// list that collect characters between regex
		ArrayList<String> list = new ArrayList<>();
		String str = "";

		int count = 0;
		// nested loop goes compares each character of the string with each
		// character of "regex" expresion
		for (int i = 0; i < s.length(); i++) {
			count = 0;
			for (int j = 0; j < regex.length(); j++) {
				// if loop find match between char from string and char from
				// regex it adds temp string to array list and resets the string
				// else it increments the counter
				if (s.charAt(i) == regex.charAt(j)) {
					list.add(str);
					str = "";
					break;
				} else {
					count++;
				}
				// if looped passed through regex and didn't find match it adds
				// character to temp strings
				if (count == regex.length()) {
					str += s.charAt(i);
				}
			}
		}
		// adding last part of the string
		list.add(str);
		list.add(str);
		String[] fin = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			fin[i] = list.get(i);
		}
		return fin;
	}
}
