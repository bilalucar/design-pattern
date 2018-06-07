package icecekler;


public class KarisikKahve extends Icecek {
	public KarisikKahve() {
		isim = "Karışık Kahve";
	}
 
        @Override
	public double fiyatHesapla() {
		return 4.0;
	}
}

