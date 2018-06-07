package menu;

//Composite(Bileşim)
import java.util.Iterator;
import java.util.ArrayList;

public class Menu extends MenuBilesen {
	ArrayList menuBilesenleri = new ArrayList();
	String menuAdi;
	String menuBilgisi;
  
	public Menu(String menuAdi, String menuBilgisi) {
		this.menuAdi = menuAdi;
		this.menuBilgisi = menuBilgisi;
	}
 
	public void ekle(MenuBilesen menuComponent) {
		menuBilesenleri.add(menuComponent);
	}
 
	public void cikar(MenuBilesen menuComponent) {
		menuBilesenleri.remove(menuComponent);
	}
 
	public MenuBilesen getCocuk(int i) {
		return (MenuBilesen)menuBilesenleri.get(i);
	}
 
	public String getMenuAdi() {
		return menuAdi;
	}
 
	public String getMenuBilgisi() {
		return menuBilgisi;
	}
 
	public void yazdir() {
		System.out.print("\n" + getMenuAdi());
		System.out.println(", " + getMenuBilgisi());
		System.out.println("---------------------");
  
		Iterator iterator = menuBilesenleri.iterator();
		while (iterator.hasNext()) {
			MenuBilesen menuComponent = 
				(MenuBilesen)iterator.next();
			menuComponent.yazdir();
		}
	}
}
