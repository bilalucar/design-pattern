/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author asimsinanyuksel
 */
//Uzerinde dolasilacak eleman
public class TakimUyesi {
    
    private String isim;
    private int yas;
    
    public TakimUyesi(String isim,int yas){
    this.isim=isim;
    this.yas=yas;
    
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the yas
     */
    public int getYas() {
        return yas;
    }

    /**
     * @param yas the yas to set
     */
    public void setYas(int yas) {
        this.yas = yas;
    }
    
}
