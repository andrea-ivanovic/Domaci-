package ucionica;

public class Polaznik {

	private String ime;
	private String prezime;
	public int id;

	public Polaznik(String ime, String prezime, int id) {
		this.ime = ime;
		this.prezime = prezime;
		this.id = id;

	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String ispis() {
		return (ime + "_" + prezime + "{" + id + "}");
	}

}