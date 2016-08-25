package zadaci_24_08_2016;

import java.math.BigDecimal;

public class DivisbleByTwoOrThree {

	public static void main(String[] args) {

		// getting first decimal number with 50 digits
		String str = "1";
		for (int i = 0; i < 49; i++) {
			str += "0";
		}

		//creating instance og BigDecimal
		BigDecimal num = new BigDecimal(str);
		//counting big decimal numbers
		int count = 0;
		do {
			//if number remain of dividing num with 2 or 3 gets 0 do:
			if (num.remainder(new BigDecimal(2)).equals(BigDecimal.ZERO)
					|| num.remainder(new BigDecimal(3)).equals(BigDecimal.ZERO)) {
				count++;	//increasing count of numbers
				System.out.println(num);	//prints number
			}
			num = num.add(BigDecimal.ONE); //increase number by one digit
		} while (count < 10);
	}

}
