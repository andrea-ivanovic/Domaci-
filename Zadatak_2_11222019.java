package domaciDrugiDeo;

import java.util.Scanner;

public class Zadatak_7_11222019 {

	public static void proizvod(int[] niz) {
		int proizvod = 1;
		for (int i = 0; i < niz.length; i++)
			if (i % 2 != 0)

				proizvod = niz[i] * proizvod;

		System.out.println("Proizvod clanova sa neparnim indexom je: " + proizvod);
	}

	public static void zbir(int[] niz) {
		int suma = 0;
		for (int i = 0; i < niz.length; i++)
			if (niz[i] % 2 == 0)
				suma = suma + niz[i];

		System.out.println("Zbir parnih clanova niza je: " + suma);
	}

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava niz od n celih brojeva i dve metode. Prva
		 * metoda vraca proizvod elemenata na neparnim pozicijama, a druga vraca zbir
		 * parnih elemenata niza.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko clanova imas Vas niz (unesite ceo broj veci od 0) ? ");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.println("Greska! Unesite ceo broj veci od nule.");
			n = sc.nextInt();
		}

		int niz[] = new int[n];
		System.out.println("Unesite clanove niza (koristite cele brojeve): ");

		for (int i = 0; i < n; i++)
			niz[i] = sc.nextInt();

		proizvod(niz);
		zbir(niz);

	}
}
