package icecekhazirlama;

public abstract class Icecek {
  
	final void icecekHazirla() {
		suyuKaynat();
		demle();
		bardagaKoy();
		icerikEkle();
	}
 
	abstract void demle();
  
	abstract void icerikEkle();
 
	void suyuKaynat() {
		System.out.println("Su kaynıyor");
	}
  
	void bardagaKoy() {
		System.out.println("Bardağa koyuluyor.");
	}
}
