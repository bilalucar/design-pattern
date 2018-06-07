package gozlemciler;

import arayuzler.Gosterim;
import arayuzler.Gozlemci;
import icpiyasaverisi.IcPiyasaVerisi;

public class SonDurumGorunumu implements Gozlemci, Gosterim {

    private String[] aciklama; 
    private double[] sonDurum;

    public SonDurumGorunumu(IcPiyasaVerisi ipVeri) {
        ipVeri.gozlemciEkle(this); 
    }

    @Override
    public void guncelle(String[] aciklama, double[] sonDurum, double[] degisimMiktari) {
        this.aciklama = aciklama;
        this.sonDurum = sonDurum;
    }

    @Override
    public String veriGetir() {
        StringBuilder veri = new StringBuilder();
        for(int i = 0; i < 10; i++){
            veri.append(aciklama[i]).append("\n");
            veri.append(sonDurum[i]).append("\n");
        }
        return ""+veri; 
    }

}
