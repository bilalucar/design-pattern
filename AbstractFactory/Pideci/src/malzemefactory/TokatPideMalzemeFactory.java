package malzemefactory;

import malzemeler.Cokelek;
import malzemeler.Kasar;
import malzemeler.Maydonoz;
import malzemeler.Sucuk;
import malzemelerinterface.Peynir;
import malzemelerinterface.Hamur;
import malzemelerinterface.Sebze;
import malzemelerinterface.Et;
import malzemeler.UstuKapaliHamur;

public class TokatPideMalzemeFactory 
	implements PideMalzemeFactory 
{

        @Override
	public Hamur hamurYap() {
		return new UstuKapaliHamur();
	}

	

        @Override
	public Peynir peynirEkle(Peynir peynirTuru) {
		return peynirTuru;
	}

        @Override
	public Sebze[] sebzeEkle() {
		Sebze sebzeler[] = { new Maydonoz() };
		return sebzeler;
	}

    @Override
    public Et[] etEkle() {
        Et etler[] = {new Sucuk() };
            return etler;
    }

	
}
