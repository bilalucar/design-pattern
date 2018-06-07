/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pideler;

import malzemefactory.PideMalzemeFactory;
import malzemeler.Kasar;

/**
 *
 * @author asimyuksel
 */
public class SucukluPide extends Pide{
    PideMalzemeFactory malzemeFactory;
 
	public  SucukluPide(PideMalzemeFactory malzemeFactory) {
		this.malzemeFactory = malzemeFactory;
	}
 
    @Override
	public void hazirla() {
		hamur = malzemeFactory.hamurYap();
                peynir=malzemeFactory.peynirEkle(new Kasar());
		etler=malzemeFactory.etEkle();
		
	}
}
