package icecekler;


public class TurkKahvesi extends Icecek {
	public TurkKahvesi() {
		isim = "Türk Kahvesi";
	}
 
        @Override
	public double fiyatHesapla() {
		return 2.99;
	}
}

