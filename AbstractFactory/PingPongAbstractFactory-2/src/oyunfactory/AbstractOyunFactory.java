/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oyunfactory;
import oyunlar.Oyun;
//import oyunlar.Pide;

public abstract class AbstractOyunFactory {
 
	protected abstract Oyun oyunUret(String item);
 
	public Oyun oyunTüret(String oyunTuru) {
		Oyun oyun = oyunUret(oyunTuru);
		System.out.println("--- " + oyun.getIsim() + " Üretiliyor ---");
                oyun.olustur();
		return oyun;
	}
}
