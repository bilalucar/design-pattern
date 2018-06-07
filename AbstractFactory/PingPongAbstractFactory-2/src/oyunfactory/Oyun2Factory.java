package oyunfactory;


import parcafactory.*;
import oyunlar.*;

public class Oyun2Factory extends AbstractOyunFactory {
 
        @Override
	protected Oyun oyunUret(String item) {
		Oyun oyun = null;
		PongGameParcaFactory parcaFactory = new PongGame2ParcaFactory();
 
		if (item.equals("oyun2")) {
			oyun = new Oyun2(parcaFactory);
			oyun.setIsim("PongGame2");

		} 
		return oyun;
	}
}
