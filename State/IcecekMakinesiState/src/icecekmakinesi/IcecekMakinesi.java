package icecekmakinesi;

import durumlar.ParaAtildi;
import durumlar.IcecekYok;
import durumlar.ParaYok;
import durumlar.IcecekSatildi;
import durumlar.Durum;

public class IcecekMakinesi {
 
	public Durum icecekYok;
	public Durum paraYok;
	public Durum paraAtildi;
	public Durum icecekSatildi;
 
	private Durum suankiDurum = icecekYok;
	private int icecekSayac = 0;
 
	public IcecekMakinesi(int icecekSayisi) {
		icecekYok = new IcecekYok(this);
		paraYok = new ParaYok(this);
		paraAtildi = new ParaAtildi(this);
		icecekSatildi = new IcecekSatildi(this);

		this.icecekSayac = icecekSayisi;
 		if (icecekSayisi > 0) {
			suankiDurum = paraYok;
		} 
	}
 
	public void paraAt() {
		suankiDurum.paraAt();
	}
 
	public void paraIadeEt() {
		suankiDurum.paraIadeEt();
	}
 
	public void calis() {
		suankiDurum.calis();
		suankiDurum.icecekVer();
	}

	public void setSuankiDurum(Durum suankiDurum) {
		this.suankiDurum = suankiDurum;
	}
 
	public void icecekAzalt() {
		System.out.println("İçecek gönderiliyor.");
		if (icecekSayac != 0) {
			icecekSayac = icecekSayac - 1;
		}
	}
 
	public int getIcecekSayac() {
		return icecekSayac;
	}
 
	public void yenidenDoldur(int count) {
		this.icecekSayac = count;
		suankiDurum = paraYok;
	}

    public Durum getSuankiDurum() {
        return suankiDurum;
    }

    public Durum getIcecekYok() {
        return icecekYok;
    }

    public Durum getParaYok() {
        return paraYok;
    }

    public Durum getParaAtildi() {
        return paraAtildi;
    }

    public Durum getIcecekSatildi() {
        return icecekSatildi;
    }
 
        @Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\nSDÜ İçecek Makinaları");
		result.append("\nAkıllı İçecek Makinesi Model 2013");
		result.append("\nIçindekiler: ").append(icecekSayac).append(" Tane İçecek Var");
		result.append("\n");
		result.append("Makineye ").append(suankiDurum).append("\n");
		return result.toString();
	}
}
