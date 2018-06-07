package icecekhazirlama;

public abstract class HookKullananIcecek {
 
	void icecekHazirla() {
		suyuKaynat();
		demle();
		bardagaKoy();
		if (musteriIcerikIstiyorMu()) {
			icerikEkle();
		}
	}
 
	abstract void demle();
 
	abstract void icerikEkle();
 
	void suyuKaynat() {
		System.out.println("Su kaynatılıyor.");
	}
 
	void bardagaKoy() {
		System.out.println("Bardağa koyuluyor.");
	}
 
	boolean musteriIcerikIstiyorMu() {
		return true;
	}

}
