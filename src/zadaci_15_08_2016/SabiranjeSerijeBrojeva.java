package zadaci_15_08_2016;

public class SabiranjeSerijeBrojeva {

	public static void main(String[] args) {
		// promjenljiva koja pamti sumu
		double sum = 0;
		// petlja ide od 1 do 98
		for (double i = 1; i < 98; i += 2) {
			// na svaku literaciju petlje dodajemo broj podjeljen sa brojem za 2
			// vecim
			sum += i / (i + 2);
		}
		System.out.printf("Suma je jednaka %3.2f", sum);

	}

}
