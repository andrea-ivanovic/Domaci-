package prevoz;

/*
 * Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja.
 *  Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
 */
public class Putnik extends Covek {

	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public double getNovac() {
		return novac;
	}

	public boolean dodajNovac(double dopuna) {
		boolean uspesan = true;

		if (dopuna > 0) {
			novac += dopuna;

			uspesan = true;
		} else {
			uspesan = false;
		}

		return uspesan;
	}

	public boolean oduzmiNovac(double naplata) {

		boolean uspesan = true;

		if (naplata > novac && novac < 0)
			uspesan = false;
		else {
			novac -= naplata;
			uspesan = true;
		}

		return uspesan;
	}
}
