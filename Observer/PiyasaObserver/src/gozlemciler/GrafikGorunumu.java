package gozlemciler;

import arayuzler.Gosterim;
import arayuzler.Gozlemci;
import icpiyasaverisi.IcPiyasaVerisi;

public class GrafikGorunumu implements Gozlemci, Gosterim {
    
    private double sonDurum;

    public GrafikGorunumu(IcPiyasaVerisi ipVeri) {
        ipVeri.gozlemciEkle(this);
    }

    @Override
    public void guncelle(String[] aciklama, double[] sonDurum, double[] degisimMiktari) {
        this.sonDurum = sonDurum[4]; // Sadece Altın
    }

    @Override
    public String veriGetir() { 
        return ""+sonDurum;
    }

}
