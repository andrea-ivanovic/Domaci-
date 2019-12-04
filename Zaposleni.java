package pozoriste;

/*
 * Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje)
 *  i pozoristem u kojem je zaposlen.
 *   Svi podaci mogu da se dohvate.
 *    Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista]. 

 */
public class Zaposleni {

	private String imePrezime;
	private Pozoriste naziv;

	public Zaposleni(String imePrezime, Pozoriste naziv) {

		this.imePrezime = imePrezime;
		this.naziv = naziv;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public Pozoriste getNaziv() {
		return naziv;
	}

	private String ispis() {
		String ispis = imePrezime + "[" + Pozoriste.getNaziv() + "]";

		return ispis;
	}

}
