/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pideler;

import malzemefactory.PideMalzemeFactory;
import malzemeler.Cokelek;

/**
 *
 * @author asimyuksel
 */
public class CokelekliPide extends Pide{

  PideMalzemeFactory malzemeFactory;
 
	public CokelekliPide(PideMalzemeFactory malzemeFactory) {
		this.malzemeFactory = malzemeFactory;
	}
 
  @Override
	public void hazirla() {
		hamur = malzemeFactory.hamurYap();
		peynir=malzemeFactory.peynirEkle(new Cokelek());
		sebzeler = malzemeFactory.sebzeEkle();
		
	}
    
}
