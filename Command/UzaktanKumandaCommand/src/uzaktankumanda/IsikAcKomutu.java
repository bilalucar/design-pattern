package uzaktankumanda;

public class IsikAcKomutu implements Komut {
	Isik isik;

	public IsikAcKomutu(Isik isik) {
		this.isik = isik;
	}

        @Override
	public void calistir() {
		isik.ac();
	}

        @Override
	public void geriAl() {
		isik.kapat();
	}
}
