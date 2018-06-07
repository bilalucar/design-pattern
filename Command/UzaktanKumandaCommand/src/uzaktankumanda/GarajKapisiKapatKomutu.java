package uzaktankumanda;

public class GarajKapisiKapatKomutu implements Komut {

    GarajKapisi garajKapisi;

    public GarajKapisiKapatKomutu(GarajKapisi garajKapisi) {
        this.garajKapisi = garajKapisi;
    }

    @Override
    public void calistir() {
        garajKapisi.kapat();
    }

    @Override
    public void geriAl() {
        garajKapisi.ac();
    }
}
