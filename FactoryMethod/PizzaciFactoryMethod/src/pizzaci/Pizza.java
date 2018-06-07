package pizzaci;

import java.util.ArrayList;

public abstract class Pizza {
	String isim;
	String hamur;
	String sos;
	ArrayList malzemeler = new ArrayList();
 
	void hazirla() {
		System.out.println(isim+" hazırlanıyor...");
		System.out.println("Hamur hazırlandı...");
		System.out.println("Sos eklendi...");
		System.out.println("Malzemeler eklendi...");
		for (int i = 0; i < malzemeler.size(); i++) {
			System.out.println("   " + malzemeler.get(i));
		}
	}
  
	void pisir() {
		System.out.println("350 derecede 20 dakika pişiriliyor");
	}
 
	void kes() {
		System.out.println("Pizzalar kesiliyor...");
	}
  
	void kutula() {
		System.out.println("Pizzalar kutuya konuldu...");
	}
 
	public String getIsim() {
		return isim;
	}

        @Override
	public String toString() {
		StringBuilder display = new StringBuilder();
		display.append("---- ").append(isim).append(" ----\n");
		display.append(hamur).append("\n");
		display.append(sos).append("\n");
		for (int i = 0; i < malzemeler.size(); i++) {
			display.append((String )malzemeler.get(i)).append("\n");
		}
		return display.toString();
	}
}

 
 
