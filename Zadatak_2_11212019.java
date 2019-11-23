package domaciDrugiDeo;

import java.util.Scanner;

public class Zadatak_5_11212019 {

	public static void deljK(int[] niz1, int k) {

		if (niz1 == null)
			System.out.println();
		else {
			for (int i = 0; i < niz1.length; i++) {

				if (niz1[i] % k == 0)

					System.out.println("Clanovi niza deljivi sa " + k + " su: " + niz1[i]);
			}

		}
	}

	public static void main(String[] args) {
		/*
		 * Korisnik ucitava niz od N elemenata niza, kao i neki broj K za deljivost.​
		 * ​Napisati metodu koja ispisuje elemente niza deljive brojem K.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko clanova ima Vas niz? ");
		int n = sc.nextInt();

		while (n <= 0) {
			System.out.println("Greska! Unesite ceo broj veci od nule.");
			n = sc.nextInt();
		}

		System.out.println("Unesite delilac (broj sa kojim delite elemente niza):");
		int delilac = sc.nextInt();
		int niz[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Unesite clanove niza: ");
			niz[i] = sc.nextInt();
		}
		deljK(niz, delilac);

	}
}
