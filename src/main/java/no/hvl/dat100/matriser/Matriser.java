package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kolonne = 0; kolonne < matrise[rad].length; kolonne++) {
				System.out.print(matrise[rad][kolonne] + " ");
			}

			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String str = "";

		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kolonne = 0; kolonne < matrise[rad].length; kolonne++) {
				if (kolonne + 1 < matrise[rad].length) {
					str += matrise[rad][kolonne] + " ";
				} else {
					str += matrise[rad][kolonne] + "\n";
				}
			}
		}

		return str;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] skalerMatrise = new int[matrise.length][matrise[0].length];

		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kolonne = 0; kolonne < matrise[rad].length; kolonne++) {
				skalerMatrise[rad][kolonne] = matrise[rad][kolonne] * tall;
			}
		}

		return skalerMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length || a[0].length != b[0].length) {
			return false;
		}

		for (int rad = 0; rad < a.length; rad++) {
			for (int kolonne = 0; kolonne < a[rad].length; kolonne++) {
				if (a[rad][kolonne] != b[rad][kolonne]) {
					return false;
				}
			}
		}

		return true;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
