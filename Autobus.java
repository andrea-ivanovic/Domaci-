package prevoz;
/*
 * Autobus poseduje naziv, vozaca, cenu karte i niz putnika koji se njime voze. 
 * Naziv, cena karte i broj mesta zadaju se prilikom kreiranja. 
 * Moguce je dodati/ukloniti putnika kao i vozaca. 
 * Moguce je naplatiti kartu putnicima samo ako je vozac prisutan.  
 * Autobus ispisati u sledecem obliku: Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... ) 
 */

public class Autobus {

	private String naziv;

	private double cenaKarte;

	private int mesta;

	private Putnik[] putnici;

	private Vozac vozac;

	public Autobus(String naziv, double cenaKarte, int mesta) {

		this.naziv = naziv;
		this.cenaKarte = cenaKarte;

		putnici = new Putnik[mesta];
		mesta = 0;

	}

	public void naplataKarte() {

		if (vozac != null) {

			for (int i = 0; i < putnici.length; i++) {
				if (putnici[i] != null)
					putnici[i].oduzmiNovac(cenaKarte);

			}
			System.out.println("Karta je naplacena.");
		} else {
			System.out.println("Molimo sacekate vozaca.");
		}
	}

	public String getNaziv() {
		return naziv;
	}

	public double getCenaKarte() {
		return cenaKarte;
	}

	public int getMesta() {
		return mesta;
	}

	public Putnik[] getPutnici() {
		return putnici;
	}

	public boolean dodajPutnika(Putnik a) {
		boolean dodat = true;

		if (mesta == putnici.length)
			dodat = false;

		else
			putnici[mesta] = a;
		mesta++;

		return dodat;
	}

	public void dodajVozaca(Vozac vozac) {

		this.vozac = vozac;

	}

	public boolean ukloniPutnika(Putnik a) {
		boolean uklonjen = true;
		int poz = -1;

		for (int i = 0; i < putnici.length; i++) {
			if (putnici[i] == a)
				poz = i;
			putnici[i] = null;

			uklonjen = true;
		}
		mesta--;
		putnici[mesta] = null;
		return uklonjen;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv).append('(').append(vozac.getIme()).append(' ').append(vozac.getPrezime()).append('-');

		String podaci = "";

		for (int i = 0; i < putnici.length; i++) {
			if (putnici[i] != null) {
				podaci = putnici[i].getIme() + putnici[i].getPrezime() + putnici[i].getId() + "["
						+ putnici[i].getNovac() + "]";

				sb.append(podaci).append(',');

			}
		}
		return sb.toString();

	}
}