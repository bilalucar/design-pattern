package icecekhazirlama;

import java.io.*;

public class HookKullananKahve extends HookKullananIcecek {
 
        @Override
	public void demle() {
		System.out.println("Kahve filtrelenerek damıtılıyor.");
	}
 
        @Override
	public void icerikEkle() {
		System.out.println("Süt ve şeker ekleniyor");
	}
 
        @Override
	public boolean musteriIcerikIstiyorMu() {

		String cevap = cevapAl();

		if (cevap.toLowerCase().startsWith("e")) {
			return true;
		} else {
			return false;
		}
	}
 
	private String cevapAl() {
		String cevap = null;

		System.out.print("Kahvenize süt ve şeker ister misiniz (e/h)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			cevap = in.readLine();
		} catch (IOException ioe) {
			System.err.println("Yanlış cevap");
		}
		if (cevap == null) {
			return "h";
		}
		return cevap;
	}
}
