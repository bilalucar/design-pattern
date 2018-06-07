package durumlar;

import icecekmakinesi.IcecekMakinesi;

public class IcecekSatildi implements Durum {
 
    IcecekMakinesi icecekMakinesi;
 
    public IcecekSatildi(IcecekMakinesi icecekMakinesi) {
        this.icecekMakinesi = icecekMakinesi;
    }
       
    @Override
	public void paraAt() {
		System.out.println("Lütfen bekleyin. Zaten içeceğinizi hazırlıyoruz");
	}
 
    @Override
	public void paraIadeEt() {
		System.out.println("Özür dileriz. Makine çalışıyor.");
	}
 
    @Override
	public void calis() {
		System.out.println("2 defa çalıştırdın diye 2 tane içecek alacağını mı sandın.");
	}
 
    @Override
	public void icecekVer() {
		icecekMakinesi.icecekAzalt();
		if (icecekMakinesi.getIcecekSayac() > 0) {
			icecekMakinesi.setSuankiDurum(icecekMakinesi.getParaYok());
		} else {
			System.out.println("Üzgünüz içecek kalmadı.");
			icecekMakinesi.setSuankiDurum(icecekMakinesi.getIcecekYok());
		}
	}
 
    @Override
	public String toString() {
		return "içecek Veriliyor";
	}
}


