package pozoriste;

import java.util.ArrayList;

/*
 * Predstava je opisana nazivom, pozoristem u kojem se izvodi 
 * i sadrzi zaposlene koji ucestvuju u realizaciji predstave. 
 * Zaposleni za realizaciju predstave mogu da se dodaju i izbace.
 *  Moze da se dohvati broj zaposlenih na predstavi.
 *   Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista     ''''''
 *    u kojem se predstava odrzava razdvojene zarezom,
 *     a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
 */
public class Predstava {

	private String nazivPredstave;
	private Pozoriste naziv;

	ArrayList<Zaposleni> zaposleni = new ArrayList<Zaposleni>(); 

	public Predstava(String nazivPredstave, Pozoriste naziv) {

		this.nazivPredstave = nazivPredstave;
		this.naziv = naziv;

	}

	public String getNazivPredstave() {
		return nazivPredstave;
	}

	public Pozoriste getNaziv() {
		return naziv;
	}

	public int getZaposleni() {
		return zaposleni.size();
	}

	public void dodajZaposlene(Zaposleni a) {
		zaposleni.add(a);
	}

	public void izbaciZaspolene(Zaposleni a) {

		zaposleni.remove(a);
	}

	public int brZaposlenih(ArrayList<Zaposleni> zaposleni) {
		int brZaposlenih = zaposleni.size();
		return brZaposlenih;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(nazivPredstave).append(',').append(Pozoriste.getNaziv());

		sb.append('\n');
		String a = "";
		for (int i = 0; i < zaposleni.size(); i++) {

			a = zaposleni.get(i).getImePrezime();

			sb.append(a).append('\n');
		}

		return sb.toString();

	}

}
