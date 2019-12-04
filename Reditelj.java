package pozoriste;

/*
 * Reditelj je zaposleni koji je prepoznatljiv po svom nadimku.
 *  Tekstualni oblik je nadimak_ime[naziv_pozorista]. 
 */

public class Reditelj extends Zaposleni {

	private String nadimak;

	public Reditelj(String imePrezime, Pozoriste naziv, String nadimak) {
		super(imePrezime, naziv);
		this.nadimak = nadimak;
	}

	public String getNadimak() {
		return nadimak;
	}

	public String ispis() {
		String ispis = nadimak + "_" + getImePrezime() + "[" + Pozoriste.getNaziv() + "]";

		return ispis;
	}

}
