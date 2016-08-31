package zadaci_30_08_2016;

public class NumberFormatException {

	public static void main(String[] args) {

		try {
			System.out.println(bin2Dec("1100101"));
			// Purposely throwing an exception
		} catch (java.lang.NumberFormatException ex) {
			System.out.println("Number not binar");
		}
		try {
			System.out.println(bin2Dec("5987"));
		} catch (java.lang.NumberFormatException ex) {
			System.out.println("String not binar");
		}
	}

	public static int bin2Dec(String bin) {

		for (int i = 0; i < bin.length(); i++) {
			// throws exception if string is not binary number
			if (bin.charAt(i) > '1' || bin.charAt(i) < '0') {
				throw new java.lang.NumberFormatException("not binary");
			}
		}
		// returns number converted binary string
		return Integer.parseInt(bin, 2);
	}
}
