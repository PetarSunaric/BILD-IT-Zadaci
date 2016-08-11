package zadaci_10_08_2016;

public class BrojMogucihKombinacija {

	public static void main(String[] args) {

		// brojac kombinacija
		int count = 0;
		// petlja oznacava prvi broj u kombinaciji
		for (int i = 1; i <= 7; i++) {
			// petlja oznacava drugi broj u kombinaciji i krece za jedan vise od
			// prvog
			for (int j = i + 1; j <= 7; j++) {
				System.out.printf("%1d%1d ", i, j);
				// kada ispise kombinaciju poveca broj kombinacija
				count++;
			}
		}
		System.out.println("\nBroj kombinacija: " + count);
	}

}
