package icpiyasaverisi;

import arayuzler.Gozlemci;
import arayuzler.Konu;
import java.util.ArrayList;


public class IcPiyasaVerisi implements Konu {

    /*
-kurucu metodu var
-konu metotlarını eziyor
-değerler değişti metodu
-setter
-getter
     */
    
    private ArrayList gozlemciler;
    private String[] aciklama;
    private double[] sonDurum = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private double[] degisimMiktari;

    public IcPiyasaVerisi() {
        gozlemciler = new ArrayList();
    }

    @Override
    public void gozlemciEkle(Gozlemci g) {
        gozlemciler.add(g);
    }

    @Override
    public void gozlemciSil(Gozlemci g) {
        gozlemciler.remove(g);
    }

    @Override
    public void haberVer() {
        if (gozlemciler.isEmpty()) {
            System.out.println("Hic gozlemci yok");
            System.out.println("------------------------");
        } else {
            for (int i = 0; i < gozlemciler.size(); i++) {
                Gozlemci gozlemci = (Gozlemci) gozlemciler.get(i);
                gozlemci.guncelle(aciklama, sonDurum, degisimMiktari);
            }
        }
    }

    public void setDegerler(String[] aciklama, double[] sonDurum, double[] degisimMiktari) {
        if(degerlerDegistiMi(sonDurum)){
            this.aciklama = aciklama;
            this.sonDurum = sonDurum;
            this.degisimMiktari = degisimMiktari;
            haberVer(); // Değerler değişti
        }
    }
    
    private boolean degerlerDegistiMi(double[] sonDurum){
        for(int i = 0; i < this.sonDurum.length; i++){
            if(this.sonDurum[i] != sonDurum[i]){
                return true;
            }
        }
        return false;
    }

    public String[] getAciklama() {
        return aciklama;
    }

    public double[] getSonDurum() {
        return sonDurum;
    }

    public double[] getDegisimMiktari() {
        return degisimMiktari;
    }
}
