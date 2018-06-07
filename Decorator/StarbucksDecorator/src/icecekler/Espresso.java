package icecekler;


public class Espresso extends Icecek {
  
	public Espresso() {
		isim = "Espresso";
	}
  
        @Override
	public double fiyatHesapla() {
		return 2.0;
	}
}

