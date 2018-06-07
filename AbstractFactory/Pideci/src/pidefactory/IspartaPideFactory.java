package pidefactory;


import malzemefactory.IspartaPideMalzemeFactory;
import malzemefactory.PideMalzemeFactory;
import pideler.KasarliPide;
import pideler.KiymaliPide;
import pideler.Pide;

public class IspartaPideFactory extends AbstractPideFactory {
 
        @Override
	protected Pide pideUret(String item) {
		Pide pide = null;
		PideMalzemeFactory malzemeFactory = 
			new IspartaPideMalzemeFactory();
 
		if (item.equals("kasarli")) {
  
			pide = new KasarliPide(malzemeFactory);
			pide.setIsim("Isparta Usulü Kaşarlı Pide");
  
		}  else if (item.equals("kiymali")) {

			pide = new KiymaliPide(malzemeFactory);
			pide.setIsim("Isparta Usulü Kıymalı Pide");
 
		} 
		return pide;
	}
}
