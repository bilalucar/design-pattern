package pideler;

import malzemefactory.PideMalzemeFactory;
import malzemeler.Kasar;

public class KasarliPide extends Pide {
	PideMalzemeFactory malzemeFactory;
 
	public KasarliPide(PideMalzemeFactory malzemeFactory) {
		this.malzemeFactory = malzemeFactory;
	}
 
        @Override
	public void hazirla() {
		hamur = malzemeFactory.hamurYap();
		peynir = malzemeFactory.peynirEkle(new Kasar());
               
	}
}
