package domaciDrugiDeo;

import java.util.Scanner;

public class Zadatak_4_11212019 {

	public static int[] unos(Scanner sc) {

		/*
		 * Korisnik ucitava niz od N elemenata niza (koristiti posebnu metodu). Napisati
		 * zasebno 2 metode Prva metoda ispisuje elemente niza​ ​koji su deljivi sa 3
		 * Druga metoda ispisuje elemente niza​ ​koji su deljivi sa 5
		 */
		System.out.println("Koliko elemenata ima Vas niz?");
		int n = sc.nextInt();

		while (n <= 0) {
			System.out.println("Greska! Unesite ceo broj veci od nule.");
			n = sc.nextInt();
		}

		int[] niz = null;
		System.out.println("Unesite elemente niza");
		niz = new int[n];

		for (int i = 0; i < n; i++) {
			niz[i] = sc.nextInt();
		}

		return niz;
	}

	public static void deljPet(int[] niz) {

		if (niz == null)
			System.out.println();
		else {
			for (int i = 0; i < niz.length; i++) {

				if (niz[i] % 5 == 0)

					System.out.println("Clanovi niza deljivi sa 5 su: " + niz[i]);
			}
			System.out.println();
		}
	}

	public static void deljTri(int[] niz) {

		if (niz == null)
			System.out.println();
		else {
			for (int i = 0; i < niz.length; i++) {

				if (niz[i] % 3 == 0)
					System.out.println("Clanovi niza deljivi sa 3 su: " + niz[i]);

			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int niz[] = unos(sc);

		deljPet(niz);

		deljTri(niz);

	}

}
