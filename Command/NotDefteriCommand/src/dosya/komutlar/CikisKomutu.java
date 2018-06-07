package dosya.komutlar;

import dosya.DosyaYoneticisi;
import javax.swing.JTextPane;
import komutkumanda.komut.Komut;

public class CikisKomutu extends Komut {
	
    private DosyaYoneticisi dosyaYoneticisi;
    
    public CikisKomutu(DosyaYoneticisi dosyaYoneticisi) {
        this.dosyaYoneticisi = dosyaYoneticisi;
    }

    @Override
    public void calistir(JTextPane textPane) {
        dosyaYoneticisi.cikis(textPane);
    }

    @Override
    public void geriAl(JTextPane textPane) {
        // Geri alınamaz.
    }
    
}