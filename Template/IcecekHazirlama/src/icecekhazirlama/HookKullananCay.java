package icecekhazirlama;

import java.io.*;

public class HookKullananCay extends HookKullananIcecek {
 
        @Override
	public void demle() {
		System.out.println("Çay demleniyor.");
	}
 
        @Override
	public void icerikEkle() {
		System.out.println("Şeker ekleniyor.");
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

		System.out.print("Çayınıza şeker istiyor musunuz (e/h)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			cevap = in.readLine();
		} catch (IOException ioe) {
			System.err.println("Yanklış cevap");
		}
		if (cevap == null) {
			return "h";
		}
		return cevap;
	}
}
