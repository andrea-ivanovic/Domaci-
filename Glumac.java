package pozoriste;

//Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista]. 
public class Glumac extends Zaposleni {

	private String uloga;

	public Glumac(String imePrezime, Pozoriste naziv, String uloga) {
		super(imePrezime, naziv);
		this.uloga = uloga;
	}

	public String getUloga() {
		return uloga;
	}

	public void setUloga(String uloga) { // uloga se menja pa zato ima i set
		this.uloga = uloga;
	}

	public String ispis() {
		String ispis = uloga + "_" + getImePrezime() + "[" + Pozoriste.getNaziv() + "]";
		return ispis;
	}

}
