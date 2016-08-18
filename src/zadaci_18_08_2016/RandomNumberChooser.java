package zadaci_18_08_2016;

public class RandomNumberChooser {

	public static void main(String[] args) {

		// prosledjujemo nekoliko brojeva metodi
		System.out.println("Vas random broj je: " + getRandom(31, 11, 8, 24, 51));

	}

	public static int getRandom(int... numbers) {

		// randomujemo broj
		int broj = (int) (1 + Math.random() * 54);
		// ako imamo bar 1 prosledjen broj
		if (numbers.length > 0) {
			for (int i = 0; i < numbers.length; i++) {
				// provjeravamo da li je jedank nasem broju
				if (numbers[i] == broj) {
					// ako jeste randomujemo novi broj i vracamo petlju na
					// pocetak
					broj = (int) (1 + Math.random() * 54);
					i = -1;
				}
			}
		}
		return broj;
	}
}
