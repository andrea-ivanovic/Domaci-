package domaciDrugiDeo;

import java.util.Scanner;

public class Zadatak_3_11192019 {

	public static void main(String[] args) {
		// da li su elementi niza palindrom - sa casa od 19.11.2019.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi duzinu niza");

		int duzina = sc.nextInt();

		int broj[] = new int[duzina];

		if (duzina <= 0) {
			System.out.println("Unesite pozitivan broj, veci od 0.");
		} else {

			for (int i = 0; i < duzina; i++) {
				System.out.println("Unesite pozitivan ceo broj veci od 0: ");
				broj[i] = sc.nextInt();

				int a = broj[i];

				int cifra = 0;
				String b = "";
				while (a > 0) {

					cifra = a % 10;
					a = a / 10;
					b = b + cifra;
				}

				if (broj[i] == Integer.parseInt(b))

					System.out.println("Element niza je palindrom.");

				else {

					System.out.println("Elemenet niza nije palindrom.");

				}
			}
		}
	}
}
