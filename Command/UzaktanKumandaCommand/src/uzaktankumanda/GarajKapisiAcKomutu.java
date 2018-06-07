package uzaktankumanda;

public class GarajKapisiAcKomutu implements Komut {

    GarajKapisi garajKapisi;

    public GarajKapisiAcKomutu(GarajKapisi garajKapisi) {
        this.garajKapisi = garajKapisi;
    }

    @Override
    public void calistir() {
        garajKapisi.ac();
    }

    @Override
    public void geriAl() {

        garajKapisi.kapat();
    }
}
