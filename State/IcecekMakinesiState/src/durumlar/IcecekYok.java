package durumlar;

import icecekmakinesi.IcecekMakinesi;

public class IcecekYok implements Durum {
    IcecekMakinesi icecekMakinesi;
 
    public IcecekYok(IcecekMakinesi icecekMakinesi) {
        this.icecekMakinesi = icecekMakinesi;
    }
 
    @Override
	public void paraAt() {
		System.out.println("İçecek yok.Boşuna para atma.");
	}
 
    @Override
	public void paraIadeEt() {
		System.out.println("İçecek yok.Para atmana da izin yok.");
	}
 
    @Override
	public void calis() {
		System.out.println("Çalıştırdın ama içecek yok akıllım.");
	}
 
    @Override
	public void icecekVer() {
		System.out.println("İçecek verilemez.");
	}
 
	public String toString() {
		return "İçecek Yok";
	}
}
