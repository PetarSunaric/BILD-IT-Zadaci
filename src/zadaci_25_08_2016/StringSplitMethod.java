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
		// loop that goes through string
		for (int i = 0; i < s.length(); i++) {
			count = 0;
			for (int j = 0; j < regex.length(); j++) {
				// if char in string is same as char in regex
				if (s.charAt(i) == regex.charAt(j)) {
					list.add(str); // adds string to list
					str = ""; // string becomes empty string
					break;
				} else {
					count++; // increase count if chars ont match
				}
				// if regex loop end with no match add character to string
				if (count == regex.length()) {
					str += s.charAt(i);
				}
			}
		}
		// add last part of string after last regex character
		list.add(str);
		String[] fin = new String[list.size()]; // making array of strings from
		for (int i = 0; i < list.size(); i++) { // list
			fin[i] = list.get(i);
		}
		return fin;
	}
}
