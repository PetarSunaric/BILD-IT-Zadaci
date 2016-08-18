package zadaci_18_08_2016;

public class CountSingleDigits {

	public static void main(String[] args) {

		// niz brojaca
		int[] count = new int[10];

		// kada dobijemo radom broj povecamo njegov count za 1
		for (int i = 0; i < 100; i++) {
			int broj = (int) (Math.random() * 10);
			count[broj]++;
		}

		// ispisujemo koliko se koji broj ponovio
		for (int i = 0; i < 10; i++) {
			System.out.print("Broj " + i + " se ponovio " + count[i] + " put");
		}
	}

}
