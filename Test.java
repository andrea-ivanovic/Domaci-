package pozoriste;

public class Test {

	public static void main(String[] args) {

		Pozoriste p = new Pozoriste("Slavija");

		Glumac g1 = new Glumac("Zika Zikic", p, "negativac");
		Glumac g2 = new Glumac("Petar Petrovic", p, "glavna uloga");
		Glumac g3 = new Glumac("Andrea Ivanovic", p, "sporedna uloga");

		Reditelj r1 = new Reditelj("Marko Markovic", p, "Strogi");

		Predstava p1 = new Predstava("Tvrdjava", p);

		p1.zaposleni.add(g1);
		p1.zaposleni.add(g2);
		p1.zaposleni.add(g3);
		p1.zaposleni.add(r1);

		System.out.println("Glumac: " + g1.ispis());
		System.out.println();
		System.out.println("Reditelj: " + r1.ispis());
		System.out.println();
		System.out.println("Pozoriste: " + p.ispis());
		System.out.println();
		System.out.println("Ispis predstave:  \n");
		System.out.println(p1.toString());

	}

}
