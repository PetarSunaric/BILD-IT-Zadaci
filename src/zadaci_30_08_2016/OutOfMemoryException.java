package zadaci_30_08_2016;

public class OutOfMemoryException {

	public static void main(String[] args) {

		try {
			// use this loop to get out of memory error
			for (String x = "x";; x += x)
				;
		} catch (java.lang.OutOfMemoryError e) { // handle with the error
			System.out.println("Out of Memory, rewrite a program!");
		}
	}

}
