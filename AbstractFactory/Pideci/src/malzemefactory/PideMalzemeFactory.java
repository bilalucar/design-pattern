package malzemefactory;

import malzemelerinterface.Peynir;
import malzemelerinterface.Hamur;
import malzemelerinterface.Sebze;
import malzemelerinterface.Et;

public interface PideMalzemeFactory {
 
	public Hamur hamurYap();
	public Peynir peynirEkle(Peynir peynirTuru);
        public Et[] etEkle();
	public Sebze[] sebzeEkle();
	
 
}
