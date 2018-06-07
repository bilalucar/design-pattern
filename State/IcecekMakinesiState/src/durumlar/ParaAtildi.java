package durumlar;

import icecekmakinesi.IcecekMakinesi;

public class ParaAtildi implements Durum {
	IcecekMakinesi icecekMakinesi;
 
	public ParaAtildi(IcecekMakinesi icecekMakinesi) {
		this.icecekMakinesi = icecekMakinesi;
	}
  
        @Override
	public void paraAt() {
		System.out.println("Zaten bir tane para attın.");
	}
 
        @Override
	public void paraIadeEt() {
		System.out.println("Para iade edildi");
		icecekMakinesi.setSuankiDurum(icecekMakinesi.getParaYok());
	}
 
        @Override
	public void calis() {
		System.out.println("Çalışıyor...");
		icecekMakinesi.setSuankiDurum(icecekMakinesi.getIcecekSatildi());
	}

        @Override
    public void icecekVer() {
        System.out.println("İçecek verilemez.");
    }
 
        @Override
	public String toString() {
		return "Çalışmaya hazırlanıyor.";
	}
}
