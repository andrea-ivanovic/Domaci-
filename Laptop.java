package ucionica;

import java.util.ArrayList;


/*
 * Laptop​ poseduje listu polaznika koji ga koriste i marku koji se zadaju prilikom kreiranja. 
 * Marka moze samo da se dohvati. Lista polaznika koji koriste laptop moze da se prosiri. 
 * Moze da se ispise u obliku (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}   
 */

public class Laptop {
	private String marka;
	private ArrayList<Polaznik> korisnici; // ko sve koristi laptop

	public String getMarka() {
		return marka;
	}

	public ArrayList<Polaznik> getKorisnici() {
		return korisnici;
	}

	public Laptop(String marka, ArrayList<Polaznik> korisnici) {

		this.marka = marka;
		this.korisnici = korisnici;

	}

	public void setKorisnici(Polaznik polaznik) {
		this.korisnici.add(polaznik);

	}

	public String ispisi() {

		String ispis = marka + "{";

		for (int i = 0; i < korisnici.size(); i++) {
			ispis = ispis + korisnici.get(i).ispis();

		}

		return ispis += "}.";

	}
}
