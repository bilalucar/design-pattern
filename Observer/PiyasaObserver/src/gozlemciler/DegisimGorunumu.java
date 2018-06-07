package gozlemciler;

import arayuzler.Gosterim;
import arayuzler.Gozlemci;
import arayuzler.Konu;

public class DegisimGorunumu implements Gozlemci, Gosterim {
    
    private String[] aciklama;
    private double[] degisimMiktari;

    public DegisimGorunumu(Konu ipVeri) {
        ipVeri.gozlemciEkle(this);
    }

    @Override
    public void guncelle(String[] aciklama, double[] sonDurum, double[] degisimMiktari) {
        this.aciklama = aciklama;
        this.degisimMiktari = degisimMiktari;
    }

    @Override
    public String veriGetir() { 
        StringBuilder veri = new StringBuilder();
        for(int i = 0; i < 10; i++){
            veri.append(aciklama[i]).append("\n");
        }
        for(int i = 0; i < 10; i++){
            veri.append(degisimMiktari[i]).append("\n");
        }
        return ""+veri;
    }
}
