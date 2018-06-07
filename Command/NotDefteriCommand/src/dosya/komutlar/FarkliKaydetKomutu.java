package dosya.komutlar;

import dosya.DosyaYoneticisi;
import javax.swing.JTextPane;
import komutkumanda.komut.Komut;

public class FarkliKaydetKomutu extends Komut {
	
    private DosyaYoneticisi dosyaYoneticisi;
    
    public FarkliKaydetKomutu(DosyaYoneticisi dosyaYoneticisi) {
        this.dosyaYoneticisi = dosyaYoneticisi;
    }

    @Override
    public void calistir(JTextPane textPane) {
        dosyaYoneticisi.farkliKaydet(textPane);
    }

    @Override
    public void geriAl(JTextPane textPane) {
        // Geri alınamaz.
    }
    
}