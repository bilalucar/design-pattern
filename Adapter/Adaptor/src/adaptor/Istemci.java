/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptor;

/**
 *
 * @author asimsinanyuksel
 */
public class Istemci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] metinListesi={"Asım","Sinan","Yüksel"};
        Yazdirabilme yazici=new YaziciAdaptor();
        yazici.yazdir(metinListesi);
    }
}
