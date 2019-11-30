package igraliste;

import java.util.ArrayList;

/*Dete ima ime, prezime, broj godina i broj klikera.   
Napraviti mogucnost da se kreira vise objekata klase Dete.  
Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira.
Napraviti metodu koja ce ispisivati broj klikera
i metodu koja ispisuje prosecan broj decjih godina(ako imamo troje dece, broj prosecnih godina za njih troje;
ako imamo dvoje racunamo prosecne godine za to dvoje) .
*/
public class Dete {

	private String ime;
	private String prezime;
	private int god;
	public static int klikeri;
	public static ArrayList<Dete> deca = new ArrayList<Dete>();  // da bismo nasli prosek godina treba nam lista dece

	public Dete(String ime, String prezime, int god, int klikeri) { //kontruktor 1 

		this.ime = ime;
		this.prezime = prezime;
		this.god = god;
		this.klikeri = klikeri;
	}

	public Dete(String ime, String prezime, int god) { //  kontruktor2 - ako ne donese klikere

		this.ime = ime;
		this.prezime = prezime;
		this.god = god;

	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGod() {
		return god;
	}

	public void setGod(int god) {
		this.god = god;
	}

	public static int getKlikeri() {
		return klikeri;
	}

	public static void setKlikeri(int klikeri) {
		Dete.klikeri = klikeri;
	}

	public int oduzmiKlikere(int n) {

		klikeri = klikeri - n;
		return klikeri;
	}

	public int dodajKlikere(int m) {
		klikeri = klikeri + m;
		return klikeri;
	}

	public static ArrayList<Dete> getDeca() {
		return deca;
	}

	public void ispis() {
		System.out.println("Broj klikera je: " + klikeri);
	}

	public static double prosek(ArrayList<Dete> deca) {

		double godine = 0;
		for (int i = 0; i < deca.size(); i++) {
			godine += deca.get(i).getGod();

		}
		double prosek = godine / deca.size();
		return prosek;

	}

}
