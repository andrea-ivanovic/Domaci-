package domaciDrugiDeo;

import java.util.Scanner;

public class Zadatak_6_11222019 {

	public static void proizvod(double[] niz) {
		// Prva metoda vraca proizvod unetih brojeva.
		double proizvod = niz[0] * niz[1] * niz[2];
		System.out.println("Proizvod unetih brojeva je " + proizvod);
	}

	public static void najmanji(double[] niz) {
		// ispisuje najmanji od unesenih brojeva.
		double min = niz[0];
		for (int i = 1; i < 2; i++) {
			if (niz[i] < min)
				niz[i] = min;

			System.out.println("Najmanji od unetih brojeva je " + min);

		}
	}

	public static void main(String[] args) {
		/*
		 * Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
		 * metode(u mainu). Prva metoda vraca proizvod unetih brojeva. Druga metoda
		 * ispisuje najmanji od unesenih brojeva.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite 3 realna broja: ");

		double niz[] = new double[3];
		for (int i = 0; i < 3; i++) {

			niz[i] = sc.nextDouble();

		}
		proizvod(niz);
		najmanji(niz);

	}

}
