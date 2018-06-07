package uzaktankumanda;

public class TVKapatKomutu implements Komut {
	TV tv;

	public TVKapatKomutu(TV tv) {
		this.tv= tv;
	}

        @Override
	public void calistir() {
		tv.kapat();
	}

        @Override
	public void geriAl() {
		tv.ac();
	}
}
