package egikkalin.egik;

import javax.swing.JTextPane;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import komutkumanda.komut.Komut;

public class EgiklikDegistirKomutu extends Komut {
	
    private EgikYaziYoneticisi egiklik;
    private StyledDocument eskiHali; // Geri sarmak için eski hali
    
    public EgiklikDegistirKomutu(EgikYaziYoneticisi egiklik, StyledDocument eskiHali) {
        // Eğiklikle ilgili tek bir buton olduğu için
        // EgikYapKomutu ve DikYapKomutu şeklinde iki komut yerine
        // EgiklikDegistirKomutu adında tek komut var.
        this.egiklik = egiklik;
        this.eskiHali = eskiHali;
    }

    @Override
    public void calistir(JTextPane textPane) {
        if(textPane.getCharacterAttributes().containsAttribute(StyleConstants.CharacterConstants.Italic, Boolean.TRUE)){
            egiklik.dikYap(textPane);
        } else {
            egiklik.egikYap(textPane);
        }
    }

    @Override
    public void geriAl(JTextPane textPane) {
        egiklik.eskiHalineDondur(textPane, eskiHali);
    }
    
}