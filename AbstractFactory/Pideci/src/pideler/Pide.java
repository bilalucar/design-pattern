package pideler;

import malzemelerinterface.Et;
import malzemelerinterface.Peynir;
import malzemelerinterface.Hamur;
import malzemelerinterface.Sebze;

public abstract class Pide {
	String isim;

	Hamur hamur;
	Sebze sebzeler[];
	Peynir peynir;
        Et etler[];
	
	

	public abstract void hazirla();

	public void pisir() {
		System.out.println("Fırında 15 Dakika Pişiriliyor");
	}

	public void kes() {
		System.out.println("Küçük Küçük Kesiliyor");
	}

	public void kutula() {
		System.out.println("Pide kutuya konuluyor");
                System.out.println("Pide gönderilmeye hazır");
                System.out.println("");
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

        @Override
	public String toString() {
            int malzemeSayisi=1;
		StringBuilder sonuc = new StringBuilder();
		sonuc.append("---- Sipariş Edilen ").append(isim).append(" Özellikleri----\n");
		if (hamur != null) {
			sonuc.append(malzemeSayisi++).append("- ").append(hamur);
			sonuc.append("\n");
		}
		
		if (peynir != null) {
			sonuc.append(malzemeSayisi++).append("- ").append(peynir);
			sonuc.append("\n");
		}
                if (etler != null) {
                    sonuc.append(malzemeSayisi++).append("- ");
			for (int i = 0; i < etler.length; i++) {
				sonuc.append(etler[i]);
				if (i < etler.length-1) {
					sonuc.append(", ");
				}
			}
			sonuc.append("\n");
		}
		if (sebzeler != null) {
                    sonuc.append(malzemeSayisi++).append("- ");
			for (int i = 0; i < sebzeler.length; i++) {
				sonuc.append(sebzeler[i]);
				if (i < sebzeler.length-1) {
					sonuc.append(", ");
				}
			}
			sonuc.append("\n");
		}
		
		
		return sonuc.toString();
	}
}
