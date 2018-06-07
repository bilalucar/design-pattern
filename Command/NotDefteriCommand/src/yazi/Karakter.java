package yazi;

import javax.swing.JTextPane;
import javax.swing.text.Document;

public class Karakter {

    public Karakter() {

    }

    public void karakterYaz(JTextPane textPane, char c, int i) {
        try{
            Document dok = textPane.getDocument();
            dok.insertString(i, c+"", null);
            textPane.setDocument(dok);
        } catch (Exception e) { }
    }

    public void karakterSil(JTextPane textPane, int i) {
        try {
            Document dok = textPane.getDocument();
            dok.remove(i, 1);
            textPane.setDocument(dok);
        } catch (Exception e) { }
    }
	
}