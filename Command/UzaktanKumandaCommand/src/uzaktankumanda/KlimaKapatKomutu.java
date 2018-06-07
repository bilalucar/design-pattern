package uzaktankumanda;

public class KlimaKapatKomutu implements Komut {
	Klima klima;
 
	public KlimaKapatKomutu(Klima klima) {
		this.klima = klima;
	}
 
        @Override
	public void calistir() {
		klima.kapat();
	}

        @Override
	public void geriAl() {
		klima.ac();
	}
}
