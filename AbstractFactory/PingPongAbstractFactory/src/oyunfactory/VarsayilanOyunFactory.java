package oyunfactory;

import javax.swing.JOptionPane;

import malzemefactory.AbstractOyunParcaFactory;
import malzemefactory.VarsayilanOyunParcaFactory;
import oyunlar.Oyun;
import oyunlar.VarsayilanOyun;

public class VarsayilanOyunFactory extends AbstractOyunFactory{

	@Override
	public Oyun oyunAc(String oyunTuru) {
		// TODO Auto-generated method stub
		Oyun oyun=null;
		AbstractOyunParcaFactory oyunParcaFabrikasi=new VarsayilanOyunParcaFactory();
		
		if(oyunTuru.equalsIgnoreCase("Seviye 1")){
		oyun=new VarsayilanOyun(oyunParcaFabrikasi);
		}
		return oyun;
	}

}
