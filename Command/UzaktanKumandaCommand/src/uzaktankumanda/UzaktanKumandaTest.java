package uzaktankumanda;

public class UzaktanKumandaTest {

	public static void main(String[] args) {

		UzaktanKumanda uzaktanKumanda = new UzaktanKumanda();

		Isik isik = new Isik();
		TV tv = new TV();
		Klima klima = new Klima();
                GarajKapisi garajKapisi=new GarajKapisi();
 
		IsikAcKomutu isikAcKomutu = new IsikAcKomutu(isik);
		KlimaAcKomutu klimaAcKomutu = new KlimaAcKomutu(klima);
                GarajKapisiAcKomutu garajKapisiAcKomutu = new  GarajKapisiAcKomutu(garajKapisi);
		GarajKapisiKapatKomutu garajKapisiKapatKomutu = new  GarajKapisiKapatKomutu(garajKapisi);
		TVAcKomutu tvAcKomutu = new TVAcKomutu(tv);
		IsikKapatKomutu isikKapatKomutu = new IsikKapatKomutu(isik);
		KlimaKapatKomutu klimaKapatKomutu = new KlimaKapatKomutu(klima);
		TVKapatKomutu tvKapatKomutu = new TVKapatKomutu(tv);
		

		Komut[] acmaKomutlari = { isikAcKomutu, klimaAcKomutu, tvAcKomutu};
		Komut[] kapatmaKomutlari = { isikKapatKomutu, klimaKapatKomutu, tvKapatKomutu};
  
		MakroKomutu tumunuAcmaMakroKomutu = new MakroKomutu(acmaKomutlari);
		MakroKomutu tumunuKapatmaMakroKomutu = new MakroKomutu(kapatmaKomutlari);
 
		uzaktanKumanda.komutAyarla(0, isikAcKomutu, isikKapatKomutu);
                uzaktanKumanda.komutAyarla(1, klimaAcKomutu, klimaKapatKomutu);
                uzaktanKumanda.komutAyarla(2, garajKapisiAcKomutu, garajKapisiKapatKomutu);
                uzaktanKumanda.komutAyarla(3, tvAcKomutu,tvKapatKomutu);
                 uzaktanKumanda.komutAyarla(4, tumunuAcmaMakroKomutu,tumunuKapatmaMakroKomutu);
		System.out.println(uzaktanKumanda);
		uzaktanKumanda.acmaDugmesineBas(0);
		uzaktanKumanda.kapatmaDugmesineBas(0);
             
	}
}
