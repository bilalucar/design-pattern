package icecekhazirlama;

public class Kahve extends Icecek {
        @Override
	public void demle() {
		System.out.println("Kahve filtrelenerek damıtılıyor.");
	}
        @Override
	public void icerikEkle() {
		System.out.println("Süt ve şeker ekleniyor.");
	}
}
