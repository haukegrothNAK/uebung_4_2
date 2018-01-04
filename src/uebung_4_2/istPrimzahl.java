package uebung_4_2;

public class istPrimzahl {

	public static boolean isPrimzahl(int testzahl) {
		boolean y = true;
		for (int n = 2; n < (testzahl - 1); n++) {
			double ergebnis = testzahl % n;
			if (ergebnis == 0) {
				y = false;
			}
		}

//		if (y) {
//			System.out.println("Die Zahl " + testzahl + " ist eine Primzahl.");
//		} else {
//			System.out.println("Die Zahl " + testzahl + " ist keine Primzahl.");
//		}
		return y;

	}

	public static void main(String[] args) {
		
		double Primzahlen=0;
		int von=2;
		int bis=10000;
		for(int x =2; x<10000;x++) {
			
			if(isPrimzahl(x)) {
				Primzahlen++;
			}
		}
		System.out.println("Im Zahlenraum von 2 bis 10000 gibt es "+Primzahlen+" Primzahlen.");
		System.out.println("Dies entspricht einem Anteil von "+((Primzahlen/9998)*100)+"%.");
		System.out.println("");
		for(int a=1; a<11;a++) {
		
		System.out.println("In dem Zahlenraum von "+(1+(a-1)*1000)+" bis "+a*1000+" gibt es "+ermittleAnzahlPrimzahlen(1+(a-1)*1000, a*1000)+" Primzahlen.");
	}}
	
	public static int ermittleAnzahlPrimzahlen (int von, int bis) {
		int AnzahlPrimzahlen=0;
		for(int x =von; x<bis;x++) {
			
			if(isPrimzahl(x)) {
				AnzahlPrimzahlen++;
			}
		}
		return AnzahlPrimzahlen;
	}
}
