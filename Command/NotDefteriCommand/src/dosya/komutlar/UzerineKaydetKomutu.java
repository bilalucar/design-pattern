package dosya.komutlar;

import dosya.DosyaYoneticisi;
import javax.swing.JTextPane;
import komutkumanda.komut.Komut;

public class UzerineKaydetKomutu extends Komut {
	
    private DosyaYoneticisi dosyaYoneticisi;
    
    public UzerineKaydetKomutu(DosyaYoneticisi dosyaYoneticisi) {
        this.dosyaYoneticisi = dosyaYoneticisi;
    }

    @Override
    public void calistir(JTextPane textPane) {
        dosyaYoneticisi.uzerineKaydet(textPane);
    }

    @Override
    public void geriAl(JTextPane textPane) {
        // Geri alınamaz.
    }
    
}