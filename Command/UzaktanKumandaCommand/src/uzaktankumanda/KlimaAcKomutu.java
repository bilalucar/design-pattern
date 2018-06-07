package uzaktankumanda;

public class KlimaAcKomutu implements Komut {
	Klima klima;

	public KlimaAcKomutu(Klima klima) {
		this.klima = klima;
	}

        @Override
	public void calistir() {
		klima.ac();
	}

        @Override
	public void geriAl() {
		klima.kapat();
	}
}
