package icecekler;

public abstract class Icecek {
	String isim = "İçecek";
  
	public String getIsim() {
		return isim;
	}
 
	public abstract double fiyatHesapla();
}
