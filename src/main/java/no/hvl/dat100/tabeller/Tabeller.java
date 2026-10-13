package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String str = "[";

		for (int i = 0; i < tabell.length; i++) {
			str += tabell[i];

			if (i < tabell.length - 1) {
				str += ",";
			}
		}

		str += "]";

		return str;

	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}

		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
		}

		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}

		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reversert = new int[tabell.length];

		for (int i = tabell.length - 1; i >= 0; i--) {
			reversert[tabell.length - 1 - i] = tabell[i];
		}

		skrivUt(reversert);
		return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			if (i + 2 <= tabell.length) {
				if (tabell[i + 1] < tabell[i]) {
					return false;
				}
			}
		}

		return true;

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sammensatt = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < sammensatt.length; i++) {
			if (i + 1 <= tabell1.length) {
				sammensatt[i] = tabell1[i];
			} else {
				sammensatt[i] = tabell2[i-tabell1.length];
			}
		}

		return sammensatt;

	}
}
