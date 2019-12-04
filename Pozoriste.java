package pozoriste;

//Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i naziv koji mogu da se dohvate.
//Moze da se sastavi tekstualni opis u obliku naziv[id]. 
public class Pozoriste {

	public static int idGlobal;
	private int id = 0;
	private static String naziv;

	public Pozoriste(String naziv) {
		this.naziv = naziv;
		id = idGlobal;
		id++;
	}

	public static int getIdGlobal() {
		return idGlobal;
	}

	public int getId() {
		return id;
	}

	public static String getNaziv() {
		return naziv;
	}

	public String ispis() {

		String ispis = naziv + "[" + id + "]";
		return ispis;
	}

}
