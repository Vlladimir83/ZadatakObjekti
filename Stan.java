package ZadatakStanovi;

public class Stan {

	double povrsina;
	int brojStanara;

	
	public Stan(double povrsina, int brojStanara) {
		super();
		this.povrsina = povrsina;
		this.brojStanara = brojStanara;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}

	public int getBrojStanara() {
		return brojStanara;
	}

	public void setBrojStanara(int brojStanara) {
		this.brojStanara = brojStanara;
	}
	
	public String toString () {
		
		return "Povrsina stana je: " + povrsina + " m2 " + "\nBroj stanara je: " + brojStanara;
	}
}
