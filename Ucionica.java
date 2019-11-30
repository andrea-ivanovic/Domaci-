package ucionica;

import java.util.ArrayList;

/*
 * Polaznik ​ ima ime i prezime koje se zadaje prilikom kreiranja polaznika. 
 * Polaznik poseduje i identifikacioni broj  ​ koji se moze dohvatiti.
 *  Ime i prezime polaznika se moze dohvatiti ali ne i postaviti. 
 *  Polaznik se ispisuje u obliku: IME_PREZIME{ID}. 
 */

public class Ucionica {

	public static void main(String[] args) {
		Polaznik P1 = new Polaznik("Petar", "Petrovic", 1);
		Polaznik P2 = new Polaznik("Marko", "Markovic", 2);
		Polaznik P3 = new Polaznik("Janko", "Jankovic", 3);

		ArrayList<Polaznik> korisnici1 = new ArrayList();
		korisnici1.add(P1);
		korisnici1.add(P2);
		korisnici1.add(P3);

		Laptop L1 = new Laptop("Dell", korisnici1);

		System.out.println(L1.ispisi());

		Polaznik P4 = new Polaznik("Marija", "Markovic", 4);
		ArrayList<Polaznik> korisnici2 = new ArrayList();
		korisnici2.add(P4);

		Laptop L2 = new Laptop("Asus", korisnici2);

		System.out.println(L2.ispisi());

	}

}
