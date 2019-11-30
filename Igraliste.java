package igraliste;

import java.util.ArrayList;

public class Igraliste {

	public static void main(String[] args) {
		Dete marko = new Dete("Marko", "Markovic", 5, 10);
		Dete petar = new Dete("Petar", "Petrovic", 7);
		Dete ana = new Dete("Ana", "Jankovic", 10, 7);
		Dete una = new Dete("Una", "Jankovic", 4);

		ArrayList<Dete> deca1 = new ArrayList();

		deca1.add(marko);
		deca1.add(petar);
		deca1.add(ana);
		deca1.add(una);

		System.out.println("Prosek godina dece na igralistu je: " + Dete.prosek(deca1));

		System.out.println("Trenutan broj klikera je: " + Dete.klikeri);
		marko.dodajKlikere(5);
		petar.dodajKlikere(3);
		System.out.println("Dodali smo klikere deci i sada je stanje klikera: " + Dete.klikeri);
		ana.oduzmiKlikere(2);
		System.out.println("Neka deca su izgubila klikere, pa je sada stanje klikera: " + Dete.klikeri);

	}

}
