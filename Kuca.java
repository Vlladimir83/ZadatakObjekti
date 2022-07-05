package ZadatakStanovi;

public class Kuca extends StambeniObjekat {

	Stan st1 = new Stan(50, 2);

	public Kuca(String adresa,Stan stan) {
		super(adresa);
		this.st1 = stan;	
	}
	
	public Kuca (String adresa,double povrsina, int brojStanara) {
		super(adresa);
		povrsina = st1.getPovrsina();
		brojStanara = st1.getBrojStanara();
	}
	
	public String toString() {
		
		return "Kuca: " + "\nAdresa: " + adresa + "\nPovrsina stana je: " + st1.getPovrsina() + " m2 " + "\nBroj Stanara je: " + st1.getBrojStanara();
				
	}
public void godPorez (double cenaM2 , double povrsina, int brojStanara) {
		
		double porez = (povrsina * cenaM2);                       // < = 2 stanara
		System.out.println(porez);
		
		double porez1 = povrsina * cenaM2 *(1-(brojStanara - 2)*0.05);  // > 2 stanara
		System.out.println(porez1);
	}
	


/*

*/
}
