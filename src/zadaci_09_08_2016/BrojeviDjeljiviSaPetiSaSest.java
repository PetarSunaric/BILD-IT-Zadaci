package zadaci_09_08_2016;

public class BrojeviDjeljiviSaPetiSaSest {

	public static void main(String[] args) {

		// brojac brojeva
		int count = 0;
		for (int i = 100; i < 1001; i++) {
			// ako je broj djeljiv sa 5 i sa 6 povecaj count i ispisi ga
			if (i % 5 == 0 && i % 6 == 0) {
				count++;
				// ako je count djeljiv sa 10 predji u novi red
				if (count % 10 == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");
			}
		}

	}

}
