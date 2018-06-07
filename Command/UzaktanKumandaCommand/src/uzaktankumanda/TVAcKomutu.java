package uzaktankumanda;

public class TVAcKomutu implements Komut {
	TV tv;

	public TVAcKomutu(TV tv) {
		this.tv= tv;
	}

        @Override
	public void calistir() {
		tv.ac();
	}

        @Override
	public void geriAl() {
		tv.kapat();
	}
}
