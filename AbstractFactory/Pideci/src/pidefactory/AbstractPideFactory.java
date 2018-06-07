package pidefactory;

import pideler.Pide;

public abstract class AbstractPideFactory {
 
	protected abstract Pide pideUret(String item);
 
	public Pide siparisVer(String pideTuru) {
		Pide pide = pideUret(pideTuru);
		System.out.println("--- " + pide.getIsim() + " Üretiliyor ---");
		pide.hazirla();
		pide.pisir();
		pide.kes();
		pide.kutula();
		return pide;
	}
}
