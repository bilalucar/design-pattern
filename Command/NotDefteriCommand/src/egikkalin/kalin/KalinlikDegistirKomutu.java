package egikkalin.kalin;

import javax.swing.JTextPane;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import komutkumanda.komut.Komut;

public class KalinlikDegistirKomutu extends Komut {
	
    private KalinYaziYoneticisi kalinlik;
    private StyledDocument eskiHali; // Geri sarmak için eski hali
    
    public KalinlikDegistirKomutu(KalinYaziYoneticisi kalinlik, StyledDocument eskiHali) {
        // Kalınlıkla ilgili tek bir buton olduğu için
        // KalinYapKomutu ve InceYapKomutu şeklinde iki komut yerine
        // KalinlikDegistirKomutu adında tek komut var.
        this.kalinlik = kalinlik;
        this.eskiHali = eskiHali;
    }

    @Override
    public void calistir(JTextPane textPane) {
        if(textPane.getCharacterAttributes().containsAttribute(StyleConstants.CharacterConstants.Bold, Boolean.TRUE)){
            kalinlik.inceYap(textPane);
        } else {
            kalinlik.kalinYap(textPane);
        }
    }

    @Override
    public void geriAl(JTextPane textPane) {
        kalinlik.eskiHalineDondur(textPane, eskiHali);
    }
    
}