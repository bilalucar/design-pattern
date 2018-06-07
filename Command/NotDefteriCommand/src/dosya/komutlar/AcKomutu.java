package dosya.komutlar;

import dosya.DosyaYoneticisi;
import javax.swing.JTextPane;
import komutkumanda.komut.Komut;

public class AcKomutu extends Komut {
	
    private DosyaYoneticisi dosyaYoneticisi;
    
    public AcKomutu(DosyaYoneticisi dosyaYoneticisi) {
        this.dosyaYoneticisi = dosyaYoneticisi;
    }

    @Override
    public void calistir(JTextPane textPane) {
        dosyaYoneticisi.ac(textPane);
    }

    @Override
    public void geriAl(JTextPane textPane) {
        // Geri alınamaz.
    }
    
}