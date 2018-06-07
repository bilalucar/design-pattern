package oyunfactory;


import parcafactory.*;
import oyunlar.*;

public class Oyun1Factory extends AbstractOyunFactory {
 
        @Override
	protected Oyun oyunUret(String item) {
		Oyun oyun = null;
		PongGameParcaFactory parcaFactory = new PongGame1ParcaFactory();
 
		if (item.equals("oyun1")) {
  
			oyun = new Oyun1(parcaFactory);
			oyun.setIsim("PongGame1");

		}
		return oyun;
	}
}
