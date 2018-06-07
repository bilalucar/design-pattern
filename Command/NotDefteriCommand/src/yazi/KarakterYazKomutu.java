package yazi;

import javax.swing.JTextPane;
import komutkumanda.komut.Komut;

public class KarakterYazKomutu extends Komut {
	
    Karakter karakter;
    char c;
    int i;

    public KarakterYazKomutu(Karakter karakter, char c, int i) {
        this.karakter = karakter;
        this.c = c;
        this.i = i;
    }

    @Override
    public void calistir(JTextPane textPane) {
        karakter.karakterYaz(textPane, c, i);
    }

    @Override
    public void geriAl(JTextPane textPane) {
        karakter.karakterSil(textPane, i);
    }
    
}