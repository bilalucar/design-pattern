package uzaktankumanda;

public class MakroKomutu implements Komut {
	Komut[] komutlar;
 
	public MakroKomutu(Komut[] komutlar) {
		this.komutlar = komutlar;
	}
 
        @Override
	public void calistir() {
		for (int i = 0; i < komutlar.length; i++) {
			komutlar[i].calistir();
		}
	}
 
        @Override
	public void geriAl() {
		for (int i = komutlar.length -1; i >= 0; i--) {
			komutlar[i].geriAl();
		}
	}
}

