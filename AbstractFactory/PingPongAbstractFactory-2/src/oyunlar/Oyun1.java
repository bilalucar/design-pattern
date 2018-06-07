package oyunlar;

import parcafactory.*;

public class Oyun1 extends Oyun {

    PongGameParcaFactory parcaFactory;

    public Oyun1(PongGameParcaFactory parcaFactory) {
        this.parcaFactory = parcaFactory;
    }

    @Override
    public void olustur() {
        cubuk = parcaFactory.cubukEkle();
        top = parcaFactory.topEkle();
    }
}
