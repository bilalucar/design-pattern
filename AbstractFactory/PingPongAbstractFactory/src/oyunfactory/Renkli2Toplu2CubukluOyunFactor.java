package oyunfactory;

import malzemefactory.AbstractOyunParcaFactory;
import malzemefactory.Renkli2Toplu2CubukluOyunParcaFactory;
import oyunlar.Oyun;
import oyunlar.Renkli2Toplu2CubukluOyun;

public class Renkli2Toplu2CubukluOyunFactor extends AbstractOyunFactory{

	@Override
	public Oyun oyunAc(String oyunTuru) {
		// TODO Auto-generated method stub
		Oyun oyun=null;
		AbstractOyunParcaFactory oyunParcaFabrikasi=new Renkli2Toplu2CubukluOyunParcaFactory();
		if(oyunTuru.equalsIgnoreCase("Seviye 2"))
			oyun=new Renkli2Toplu2CubukluOyun(oyunParcaFabrikasi);
			return oyun;
		
		
		
	
	}

}
