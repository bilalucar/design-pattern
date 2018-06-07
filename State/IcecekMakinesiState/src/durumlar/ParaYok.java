package durumlar;

import icecekmakinesi.IcecekMakinesi;

public class ParaYok implements Durum {
    IcecekMakinesi icecekMakinesi;
 
    public ParaYok(IcecekMakinesi icecekMakinesi) {
        this.icecekMakinesi = icecekMakinesi;
    }
 
    @Override
	public void paraAt() {
		System.out.println("Para attınız.");
		icecekMakinesi.setSuankiDurum(icecekMakinesi.getParaAtildi());
	}
 
    @Override
	public void paraIadeEt() {
		System.out.println("Para atmadın ki iade edeyim.");
	}
 
    @Override
	public void calis() {
		System.out.println("Parasız çalışmam.");
	 }
 
    @Override
	public void icecekVer() {
		System.out.println("Önce para. Sonra içecek.");
	} 
 
    @Override
	public String toString() {
		return "Para atılması bekleniyor";
	}
}
