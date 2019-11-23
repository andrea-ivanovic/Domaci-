package domaciDrugiDeo;

import java.util.Scanner;

public class Zadatak_1_11192019 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je
		 * palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije
		 * palindrom)
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi duzinu niza");

		int duzina = sc.nextInt();

		int broj[] = new int[duzina]; // niz brojeva koji je duzine "duzina"

		boolean palindrom;
		if (duzina <=0) {System.out.println("Unesite pozitivan broj, veci od 0.");}
    	else {
    	
		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesi element niza:");
			broj[i] = sc.nextInt(); // svakom broju u nizu smo dodelili poziciju i
		}

		for (int i = duzina - 1; i > 0; i--) {//ucitaj niz in reverse 

			if (broj[i] != broj[duzina - i - 1]) { //da li su prvi i poslednji clan isti

				palindrom = false;
				System.out.println("Nije nije palindrom.");
				break;
			}

			else {
				palindrom = true;
				System.out.println("Niz jeste palindrom.");
				break;
			}

		}
	}
}}