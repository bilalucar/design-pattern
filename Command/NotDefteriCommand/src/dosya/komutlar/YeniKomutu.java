package dosya.komutlar;

import dosya.DosyaYoneticisi;
import javax.swing.JTextPane;
import komutkumanda.komut.Komut;

public class YeniKomutu extends Komut {
	
    private DosyaYoneticisi dosyaYoneticisi;
    
    public YeniKomutu(DosyaYoneticisi dosyaYoneticisi) {
        this.dosyaYoneticisi = dosyaYoneticisi;
    }

    @Override
    public void calistir(JTextPane textPane) {
        dosyaYoneticisi.yeni(textPane);
    }

    @Override
    public void geriAl(JTextPane textPane) {
        // Geri alınamaz.
    }
    
}