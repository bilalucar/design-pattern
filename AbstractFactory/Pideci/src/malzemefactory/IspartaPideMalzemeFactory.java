package malzemefactory;

import malzemeler.Biber;
import malzemeler.Domates;
import malzemeler.Sogan;
import malzemelerinterface.Peynir;
import malzemeler.UstuAcikHamur;
import malzemeler.Kiyma;
import malzemelerinterface.Hamur;
import malzemelerinterface.Sebze;
import malzemelerinterface.Et;

public class IspartaPideMalzemeFactory implements PideMalzemeFactory {
 
        @Override
	public Hamur hamurYap() {
		return new UstuAcikHamur();
	}
 
	
 
        @Override
	public Peynir peynirEkle(Peynir peynirTuru) {
		return peynirTuru;
	}
 
        @Override
	public Sebze[] sebzeEkle() {
		Sebze sebzeler[] = { new Sogan(),new Biber(),new Domates()};
		return sebzeler;
	}

    @Override
    public Et[] etEkle() {
             Et etler[] = { new Kiyma() };
            return etler;
    }

}
