package uzaktankumanda;


//Aracı(Invoker)
public class UzaktanKumanda {
	Komut[] acmaKomutlari;
	Komut[] KapatmaKomutlari;
	Komut geriAlKomutu;
 
	public UzaktanKumanda() {
		acmaKomutlari = new Komut[5];
		KapatmaKomutlari = new Komut[5];
 
		Komut noCommand = new KomutYok();
		for(int i=0;i<acmaKomutlari.length;i++) {
			acmaKomutlari[i] = noCommand;
			KapatmaKomutlari[i] = noCommand;
		}
		geriAlKomutu = noCommand;
	}
  
	public void komutAyarla(int dugmeNo, Komut acmaKomutu, Komut kapatmaKomutu) {
		acmaKomutlari[dugmeNo] = acmaKomutu;
		KapatmaKomutlari[dugmeNo] = kapatmaKomutu;
	}
 
	public void acmaDugmesineBas(int dugmeNo) {
		acmaKomutlari[dugmeNo].calistir();
		geriAlKomutu = acmaKomutlari[dugmeNo];
	}
 
	public void kapatmaDugmesineBas(int dugmeNo) {
		KapatmaKomutlari[dugmeNo].calistir();
		geriAlKomutu = KapatmaKomutlari[dugmeNo];
	}

	public void geriAlDugmesineBas() {
		geriAlKomutu.geriAl();
	}
 
        @Override
	public String toString() {
		StringBuilder stringBuff = new StringBuilder();
		stringBuff.append("\n------ Uzaktan Kumanda-------\n");
		for (int i = 0; i < acmaKomutlari.length; i++) {
			stringBuff.append("[düğme ").append(i).append("] ").append(acmaKomutlari[i].getClass().getName()).append("    ").append(KapatmaKomutlari[i].getClass().getName()).append("\n");
		}
		stringBuff.append("[gerial] ").append(geriAlKomutu.getClass().getName()).append("\n");
		return stringBuff.toString();
	}
}
