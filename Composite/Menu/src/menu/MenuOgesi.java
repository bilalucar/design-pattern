package menu;

//Leaf(Yaprak)

public class MenuOgesi extends MenuBilesen {
	String isim;
	String bilgi;
	double fiyat;
    
	public MenuOgesi(String isim, 
	                String bilgi, 
	               double fiyat) 
	{ 
		this.isim = isim;
		this.bilgi = bilgi;
		this.fiyat = fiyat;
	}
  
	public String getMenuAdi() {
		return isim;
	}
  
	public String getMenuBilgisi() {
		return bilgi;
	}
  
	public double getFiyat() {
		return fiyat;
	}
  
  
	public void yazdir() {
		System.out.print("  " + getMenuAdi());
		System.out.println(", " + getFiyat());
		System.out.println("     -- " + getMenuBilgisi());
	}
}
