package dosya;

import dosya.yardimci.TxtFilter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class DosyaYoneticisi {

    private File dosya = null;
    private boolean kaydedildiMi = true;
    
    public DosyaYoneticisi() {

    }

    public void setKaydedildiMi(boolean kaydedildiMi) {
        this.kaydedildiMi = kaydedildiMi;
    }
    
    public void cikis(JTextPane textPane){
        if(!kaydedildiMi) {
            int cevap = JOptionPane.showConfirmDialog
                    (null, 
                    "Dosyayı kaydetmek ister misiniz?", 
                    "Dosya Kaydedilmedi", 
                    JOptionPane.YES_NO_CANCEL_OPTION);
            
            if(cevap==2 || cevap==-1) return; // "CANCEL" veya "x"
            if(cevap==0) uzerineKaydet(textPane); // "YES"            
        }
        System.exit(0);
    }
    
    public void ac(JTextPane textPane) {
        if(!kaydedildiMi) {
            int cevap = JOptionPane.showConfirmDialog
                    (null, 
                    "Dosyayı kaydetmek ister misiniz?", 
                    "Dosya Kaydedilmedi", 
                    JOptionPane.YES_NO_CANCEL_OPTION);
            
            if(cevap==2 || cevap==-1) return; // "CANCEL" veya "x"
            if(cevap==0) uzerineKaydet(textPane); // "YES"            
        }
        JFileChooser dosyaSecici = new JFileChooser();
        dosyaSecici.setDialogTitle("Aç");
        int durum = dosyaSecici.showOpenDialog(null);
        if(durum == 0){
            try { 
                dosya = dosyaSecici.getSelectedFile();
                StringBuilder metin = new StringBuilder();
                FileInputStream fis = new FileInputStream(dosya); 
                InputStreamReader isr = new InputStreamReader(fis, "ISO-8859-9"); 
                int c; 
                while ((c = isr.read()) != -1) { 
                    metin.append((char)c);
                } 
                isr.close(); 
                fis.close(); 
                textPane.setText(metin+"");
                kaydedildiMi = true; // Zaten aynısı kayıtlı
            }
            catch (Exception e){}
        }
    }
    
    public void yeni(JTextPane textPane) {
        if(!kaydedildiMi) {
            int cevap = JOptionPane.showConfirmDialog
                    (null, 
                    "Dosyayı kaydetmek ister misiniz?", 
                    "Dosya Kaydedilmedi", 
                    JOptionPane.YES_NO_CANCEL_OPTION);
            
            if(cevap==2 || cevap==-1) return; // "CANCEL" veya "x"
            if(cevap==0) uzerineKaydet(textPane); // "YES"            
        }
        // "YES" veya "NO" seçildiyse veya kaydedildiyse.
        textPane.setText("");
        kaydedildiMi = false; // Boş da olsa bir yere kaydetmek isteyebiliriz.
        dosya = null;
    }
    
    public void uzerineKaydet(JTextPane textPane) {
        if(dosya==null) {
            farkliKaydet(textPane);
        } else {
            dosya.delete();
            kaydet(textPane);
        }
    }

    public void farkliKaydet(JTextPane textPane) {
        JFileChooser dosyaSecici = new JFileChooser(dosya);
        dosyaSecici.setDialogTitle("Kaydet");
        dosyaSecici.setFileFilter(new TxtFilter());
        int cevap = dosyaSecici.showSaveDialog(null);
        if(cevap == JFileChooser.APPROVE_OPTION){
            File eskiDosya = dosya;
            String adres = dosyaSecici.getSelectedFile().getPath();
            adres += adres.substring(adres.length()-4).equals(".txt") ? "" : ".txt";
            dosya = new File(adres);
            if(dosya.exists()){
                int cevap2 = JOptionPane.showConfirmDialog(
                        null
                        , "Böyle bir dosya zaten var. "
                        + "Üzerine kaydetmek ister misiniz?"
                        , "Zaten Var", JOptionPane.YES_NO_OPTION);
                
                if(cevap2 == JOptionPane.YES_OPTION){
                    uzerineKaydet(textPane);
                } else if(cevap2 == JOptionPane.NO_OPTION){
                    dosya = eskiDosya;
                    farkliKaydet(textPane);
                }
            } else {
                kaydet(textPane);
            }
        }
    }
    
    private void kaydet(JTextPane textPane){
        try {
            dosya.createNewFile();
            BufferedWriter yazici = new BufferedWriter(new FileWriter(dosya));
            yazici.write(textPane.getText());
            yazici.close();
            kaydedildiMi = true;
        } catch (Exception e) { }
    }
    

}