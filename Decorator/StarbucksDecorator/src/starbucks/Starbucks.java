package starbucks;

import dekoratorler.Krema;
import dekoratorler.Cikolata;
import dekoratorler.DamlaSakizi;
import dekoratorler.Sut;
import icecekler.KarisikKahve;
import icecekler.Espresso;
import icecekler.TurkKahvesi;
import icecekler.Icecek;

public class Starbucks {
 
	public static void main(String args[]) {
		Icecek icecek = new Espresso();
		System.out.println(icecek.getIsim() 
				+": "+ icecek.fiyatHesapla()+ " TL" );
 
		Icecek icecek2 = new TurkKahvesi();
		icecek2 = new Sut(icecek2);
		System.out.println(icecek2.getIsim() 
				 + ": "+icecek2.fiyatHesapla()+ " TL" );
 
		Icecek icecek3 = new KarisikKahve();
		icecek3 = new Cikolata(icecek3);
		icecek3 = new Krema(icecek3);
                icecek3 = new DamlaSakizi(icecek3);
                icecek3 = new Sut(icecek3);
		System.out.println(icecek3.getIsim() 
				 + ": "+icecek3.fiyatHesapla()+ " TL");
	}
}
