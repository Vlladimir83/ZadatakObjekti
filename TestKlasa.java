package ZadatakStanovi;

import java.util.Scanner;

public class TestKlasa {

	public static void main(String[] args) {
		
		
		
		Scanner Test = new Scanner(System.in);
		System.out.println("Unesite adresu stambenog objekta: ");
		String adresa = Test.nextLine();
		System.out.println("Unesite slovo k za kucu i slovo z sa zgradu: ");
		Scanner objekat = new Scanner(System.in);
		String obj = objekat.nextLine();
		double ukupanPorez=0;
		
		if(obj.equals("k"))
		{
			
			System.out.println("Unesite povrsinu kuce: ");
			double povrsina = Test.nextDouble();
			System.out.println("Unesite broj stanara u kuci: ");
			int brojStanara = Test.nextInt();
			System.out.println("Unesite cjenu po m2: ");
			double cjenaM2 = Test.nextDouble();
			
			System.out.println("\nAdresa kuce: " + adresa);
			System.out.println("\nPovrsina kuce je : " + povrsina + " m2");
			System.out.println("Broj stanara u kuci je : " + brojStanara);
			if(brojStanara <= 2) {
				ukupanPorez = ukupanPorez + (povrsina * cjenaM2);
				System.out.println("Porez je: " + (povrsina * cjenaM2) );
			}
			else {
				ukupanPorez = ukupanPorez + (povrsina * cjenaM2 * (1 - (brojStanara - 2 ) * 0.05));
				System.out.println("Porez je: " + (povrsina * cjenaM2 * (1 - (brojStanara - 2 ) * 0.05)));
			}
			
		
		}
		else if(obj.equals("z")) {
			
			System.out.println("Unesite broj stanova zgrade: ");
			int brStanova = Test.nextInt();
			for(int i=1;i<=brStanova;i++) {
				Zgrada stZ = new Zgrada("beogradska", 50, 2);
				System.out.println("\nUnesite povrsinu stana " + i);
				double povrsina= Test.nextDouble();
				System.out.println("Unesite broj stanara za stan " + i);
				int brojStanara = Test.nextInt();
				System.out.println("Unesite cjenu po kvadratu");
				double cjenaM2 = Test.nextDouble();
				System.out.println("Adresa: " + adresa);
				System.out.println("Povrsina stana je : " + povrsina + " m2");
			if(brojStanara <= 2) {
				ukupanPorez = ukupanPorez + (povrsina * cjenaM2);
				System.out.println("Porez je: " + (povrsina * cjenaM2) + " $" );
			}
			else {
				ukupanPorez = ukupanPorez + (povrsina * cjenaM2 * (1 - (brojStanara - 2 ) * 0.05));
				System.out.println("Porez je: " + (povrsina * cjenaM2 * (1 - (brojStanara - 2 ) * 0.05)));
			}
		}
			System.out.println("Ukupan poorez za sve stanove zgrade je: " + ukupanPorez + " $");
		
		}
		
		
		
		

	}

}
