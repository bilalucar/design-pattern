package icecekler;


public class KafeinsizKahve extends Icecek {
	public KafeinsizKahve() {
		isim = "Kafeinsiz Kahve";
	}
 
        @Override
	public double fiyatHesapla() {
		return 3.05;
	}
}

