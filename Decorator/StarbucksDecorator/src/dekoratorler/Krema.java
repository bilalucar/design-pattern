package dekoratorler;
 
import icecekler.Icecek;

public class Krema extends IcindekilerDecorator {
	Icecek icecek;
 
	public Krema(Icecek beverage) {
		this.icecek = beverage;
	}
 
        @Override
	public String getIsim() {
		return icecek.getIsim() + ", Kremalı";
	}
 
        @Override
	public double fiyatHesapla() {
		return 1.10 + icecek.fiyatHesapla();
	}
}
