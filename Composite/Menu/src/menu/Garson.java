package menu;

//Client (İstemci)
  
public class Garson {
	MenuBilesen tumMenuler;
 
	public Garson(MenuBilesen tumMenuler) {
		this.tumMenuler = tumMenuler;
	}
 
	public void menuyuYazdir() {
		tumMenuler.yazdir();
	}
}
