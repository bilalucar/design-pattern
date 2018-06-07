package dekoratorler;

import icecekler.Icecek;

public class Sut extends IcindekilerDecorator {
	Icecek icecek;

	public Sut(Icecek beverage) {
		this.icecek = beverage;
	}

        @Override
	public String getIsim() {
		return icecek.getIsim() + ", Sütlü";
	}

        @Override
	public double fiyatHesapla() {
		return 2.10 + icecek.fiyatHesapla();
	}
}
