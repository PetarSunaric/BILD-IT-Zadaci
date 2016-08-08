package zadaci_08_08_2016;

public class SavrseniBrojevi {

	public static void main(String[] args) {
		System.out.println("Savrseni brojevi do 10 hiljada su: ");
		// petlja ide do 10000 i ako je broj savrsen ispise ga
		for (int i = 1; i < 10000; i++) {
			if (jeSavrsen(i)) {
				System.out.print(i + " ");
			}
		}

	}

	public static boolean jeSavrsen(int broj) {
		int sum = 0;
		// petlja ide od 1 do broja
		for (int i = 1; i < broj; i++) {
			// ako je nekav broj djeljiv sa proslijedjenim brojem dodaje ga na
			// sumu
			if (broj % i == 0) {
				sum += i;
			}
		}
		// ako je suma jednaka nasem broju onda je on savrsen
		if (broj == sum) {
			return true;
		}
		return false;
	}

}
