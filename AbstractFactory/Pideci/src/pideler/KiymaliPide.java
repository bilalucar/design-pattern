package pideler;

import malzemefactory.PideMalzemeFactory;

public class KiymaliPide extends Pide {
	PideMalzemeFactory malzemeFactory;
 
	public KiymaliPide(PideMalzemeFactory malzemeFactory) {
		this.malzemeFactory = malzemeFactory;
	}
 
        @Override
	public void hazirla() {
		hamur = malzemeFactory.hamurYap();
                etler=malzemeFactory.etEkle();
		sebzeler = malzemeFactory.sebzeEkle();
		
	}
}
