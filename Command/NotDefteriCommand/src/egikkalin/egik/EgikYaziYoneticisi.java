package egikkalin.egik;

import javax.swing.JTextPane;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

public class EgikYaziYoneticisi {

    public EgikYaziYoneticisi() {

    }

    public void egikYap(JTextPane textPane) {
        Document doc = textPane.getDocument();
        Style style = new StyleContext().addStyle(null, null);
        StyleConstants.setItalic(style, true); // Burası farklı bir tek
        String seciliYazi = textPane.getSelectedText();    
        int ilk = textPane.getSelectionStart();    
        try {
            doc.remove(ilk, seciliYazi.length());
            doc.insertString(ilk, seciliYazi, style);
        } catch (Exception e) { }
        textPane.setDocument(doc);
    }
    
    public void dikYap(JTextPane textPane) {
        Document doc = textPane.getDocument();
        Style style = new StyleContext().addStyle(null, null);
        StyleConstants.setItalic(style, false); // Burası farklı bir tek
        String seciliYazi = textPane.getSelectedText();    
        int ilk = textPane.getSelectionStart();    
        try {
            doc.remove(ilk, seciliYazi.length());
            doc.insertString(ilk, seciliYazi, style);
        } catch (Exception e) { }
        textPane.setDocument(doc);
    }
    
    public void eskiHalineDondur(JTextPane textPane, StyledDocument eskiHali) {
        // JTextPane'i eski haline döndür
        System.out.println("eskiiiiiiiiiiiiiiii"); 
        textPane.setStyledDocument(eskiHali);
    }
    
    
	
}