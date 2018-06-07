package oyunlar;

import parcafactory.*;

public class Oyun2 extends Oyun {

    PongGameParcaFactory parcaFactory;

    public Oyun2(PongGameParcaFactory parcaFactory) {
        this.parcaFactory = parcaFactory;
    }

    @Override
    public void olustur() {
        cubuk = parcaFactory.cubukEkle();
        top = parcaFactory.topEkle();
    }
}
