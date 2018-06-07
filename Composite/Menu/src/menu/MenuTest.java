package menu;

public class MenuTest {
	public static void main(String args[]) {
		MenuBilesen kahvaltiMenu = 
			new Menu("Yukseller Restorant", "Kahvaltı");
		MenuBilesen aksamMenu = 
			new Menu("Akşam Menüsü", "Akşam Yemeği");
		MenuBilesen kafeMenu = 
			new Menu("Kafe Menüsü", "Kafe");
		MenuBilesen tatliMenu = 
			new Menu("Tatlı Menüsü", "Tatlılar");
		MenuBilesen tumMenuler = new Menu("Tüm Menüler", "Hepsi Birarada");
  
		tumMenuler.ekle(kahvaltiMenu);
		tumMenuler.ekle(aksamMenu);
		tumMenuler.ekle(kafeMenu);
  
		kahvaltiMenu.ekle(new MenuOgesi(
			"Köy Kahvaltısı", 
			"Kendinizi Köyde Hissedin", 
			10));
		kahvaltiMenu.ekle(new MenuOgesi(
			"Vejeteryan Kahvaltı", 
			"Sağlıklı beslenmek isteyenlere", 
			8));

		aksamMenu.ekle(new MenuOgesi(
			"Izgara Menüsü",
			"Karışık Izgara", 
			15));
		aksamMenu.ekle(new MenuOgesi(
			"Çorba Menü",
			"Mercimek Çorbası, Salata, Bir dilim ekmek",  
			5));
		aksamMenu.ekle(new MenuOgesi(
			"Vejeteryan Menü",
			"Ssadece Salata", 
			2));
   
		tatliMenu.ekle(new MenuOgesi(
			"Kadayıf",
			"Kaymaklı Kadayıf",
			8));
  
		tatliMenu.ekle(new MenuOgesi(
			"Tiramisu",
			"Damla sakızlı,tarçınlı tiramisu",
			10));

		kafeMenu.ekle(new MenuOgesi(
			"Türk Kahvesi",
			"Sade Türk Kahvesi",
			4));
		kafeMenu.ekle(new MenuOgesi(
			"Mocha",
			"Beyaz Çikolatalı Ice Mocha",
			6));
 
		Garson garson = new Garson(tumMenuler);
   
		garson.menuyuYazdir();
	}
}
