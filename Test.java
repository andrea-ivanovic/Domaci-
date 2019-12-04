package prevoz;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		// Putnik [] putnici = new Putnik [];
		Vozac vozac = new Vozac("Marko", "Markovic", "sofer");
		Autobus A1 = new Autobus("AutoKodeks", 800, 5);
		Autobus A2 = new Autobus("Lasta", 600, 20);

		Putnik p1 = new Putnik("Pera", "Peric", 1000);
		Putnik p2 = new Putnik("Zika", "Zikic", 1500);
		Putnik p3 = new Putnik("Ana", "Anic", 100);
		Putnik p4 = new Putnik("Marija", "Markovic", 1000);

		System.out.println(p3.dodajNovac(1200)); // ako je true, dodat je novac uspesno;
		System.out.println(p4.dodajNovac(800)); // ako je true, putnik je uspesno izgubio novac prilikom ukrcavanja

		A1.dodajVozaca(vozac);
		A1.dodajPutnika(p1);
		A1.dodajPutnika(p3);
		A1.dodajPutnika(p4);
		System.out.println(A1.toString());

		System.out.println(p4.oduzmiNovac(800));// ako je true, naplaceno je uspesno;
		A1.naplataKarte();

		A2.dodajPutnika(p2);
		A2.naplataKarte();

	}

}
