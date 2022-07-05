package ZadatakStanovi;

public class Zgrada extends StambeniObjekat {

	Stan stZ = new Stan(55, 3);
	
	public Zgrada(String adresa,double povrsina,int brojStanara) {
		super(adresa);
		
		 povrsina =stZ.getPovrsina();
		 brojStanara = stZ.getBrojStanara();

	}

	public String toString() {
		
		
		return"\nPovrsina stana je: " + stZ.getPovrsina()+ " m2" + "\nBroj stanara je : " + stZ.brojStanara;
	}

	double cenaM2;
	
	public void godPorez (double cenaM2 , double povrsina) {
		
		double porez = (povrsina * cenaM2);                // < = 2 stanara
		System.out.println(porez);
		
		
	
	}
	 public void godPorez1 (double cenaM2 , double povrsina, int brojStanara) {
		 
		 double porez1 = povrsina * cenaM2 *(1-(brojStanara - 2)*0.05);               // > od 2 stanara
			System.out.println(porez1);
		 
	 }
	
}
