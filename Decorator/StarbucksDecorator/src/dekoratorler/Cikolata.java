package dekoratorler;

import icecekler.Icecek;

public class Cikolata extends IcindekilerDecorator {
	Icecek icecek;
 
	public Cikolata(Icecek beverage) {
		this.icecek = beverage;
	}
 
        @Override
	public String getIsim() {
		return icecek.getIsim() + ", Çikolatalı";
	}
 
        @Override
	public double fiyatHesapla() {
		return 1.20 + icecek.fiyatHesapla();
	}
}
