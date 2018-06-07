package uzaktankumanda;

public class IsikKapatKomutu implements Komut {
	Isik isik;

	public IsikKapatKomutu(Isik isik) {
		this.isik = isik;
	}

        @Override
	public void calistir() {
		isik.kapat();
	}

        @Override
	public void geriAl() {
		isik.ac();
	}
}
