package pidefactory;


import malzemefactory.TokatPideMalzemeFactory;
import malzemefactory.PideMalzemeFactory;
import pideler.CokelekliPide;
import pideler.Pide;
import pideler.SucukluPide;

public class TokatPideFactory extends AbstractPideFactory {

        @Override
	protected Pide pideUret(String item) {
		Pide pide = null;
		PideMalzemeFactory malzemeFactory =
		new TokatPideMalzemeFactory();

		if (item.equals("cokelekli")) {

			pide = new CokelekliPide(malzemeFactory);
			pide.setIsim("Tokat Usulü Çökelekli Pide");

		}  else if (item.equals("sucuklu")) {

			pide = new SucukluPide(malzemeFactory);
			pide.setIsim("Tokat Usulü Sucuklu Pide");

		}
		return pide;
	}
}
