package prevoz;

/*
 * Covek poseduje ime i prezime, i jedinstveni identifikacioni broj koji se dodeljuju prilikom kreiranja objekta.
 *  Svi podaci mogu da se dohvate, ali ne i postave.
 */
public class Covek {

	
	private String ime; 
	private String prezime; 
	private static int idGlobal =0;
	private int id;
	public Covek(String ime, String prezime) {
		
		this.ime = ime;
		this.prezime = prezime;
		id = idGlobal;
		id ++;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getId() {
		return id;
	}
	
	
	
	
}
