package komutkumanda.kumanda;

import java.util.ArrayList;
import javax.swing.JTextPane;
import komutkumanda.komut.Komut;

public class Kumanda {
    
    JTextPane textPane;
    ArrayList<Komut> komutlar = new ArrayList<>(); // Sınırsız geri alma özelliği

    public Kumanda(JTextPane textPane){
        this.textPane = textPane;
    }
    
    public void komutuYerineGetir(Komut komut) {
        komutlar.add(komut);
        komut.calistir(textPane);
    }

    public void geriAlDugmesineBas() {
        if(komutlar.size() > 0){
            komutlar.get(komutlar.size()-1).geriAl(textPane);
            komutlar.remove(komutlar.size()-1);
        }
    }

}